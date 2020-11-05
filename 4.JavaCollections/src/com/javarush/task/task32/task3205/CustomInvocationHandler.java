package com.javarush.task.task32.task3205;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CustomInvocationHandler implements InvocationHandler {
    private SomeInterfaceWithMethods someInterfaceWithMethodsOriginal;

    public CustomInvocationHandler(SomeInterfaceWithMethods origMethod) {
            someInterfaceWithMethodsOriginal = origMethod;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName() + " in");
        method.invoke(someInterfaceWithMethodsOriginal, args);
        System.out.println(method.getName() + " out");
        return "";
    }
}
