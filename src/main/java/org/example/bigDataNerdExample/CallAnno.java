package org.example.bigDataNerdExample;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CallAnno {
    public static void main(String[] args) {
        try {
            for (Method method : Class.forName("org.example.bigDataNerdExample.AnnoImplementation").getMethods()) {
                if (method.isAnnotationPresent(FirstAnnotation.class))     {
                    try {
                        System.out.println(method.getName()); // prints "callMe"
                        method.invoke(null); // prints "test"
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
