package org.reflexion_lab;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class Injector {
    private final Properties properties;

    public Injector() {
        properties = new Properties();
    }

    public void connectToProperties(String pathToFile) throws IOException {
        FileReader file_reader = new FileReader(pathToFile);
        properties.load(file_reader);
    }

    private String findValueInProperties(Field field) {
        return properties.getProperty(field.getType().toString().split(" ")[1]);
    }

    public Object inject(Object objectToBeInjected) {
        Class<?> classOfThisObject = objectToBeInjected.getClass();
        for (Field field : classOfThisObject.getDeclaredFields()) {
            try
            {
                Object instanceOfThisClass = Class.forName(findValueInProperties(field)).getDeclaredConstructor().newInstance();
                field.setAccessible(true);
                field.set(objectToBeInjected, instanceOfThisClass);
            }
            catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException |
                   ClassNotFoundException e)
            {
                throw new RuntimeException(e);
            }
        }
        return objectToBeInjected;
    }


}
