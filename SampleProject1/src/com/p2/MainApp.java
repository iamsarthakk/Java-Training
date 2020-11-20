package com.p2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import 	java.lang.reflect.Method;

public class MainApp {

	public static void main(String[] args) 
		throws NoSuchMethodException,
		SecurityException, IllegalAccessException,
		IllegalArgumentException,
		InvocationTargetException, NoSuchFieldException{
		Test obj = new Test();
		
		Class cls = obj.getClass();
		System.out.println("The name of the class is "+ cls.getName());
		
		Constructor constructor = cls.getConstructor();
		System.out.println("the name of the constructor is "+constructor.getName());
		System.out.println("The public methods of class are: ");
		
		Method[] methods = cls.getMethods();
		
		for (Method method:methods)
			System.out.println(method.getName());
		
		Method methodcall1 = cls.getDeclaredMethod("method2", int.class);
		
		methodcall1.invoke(obj,19);
		
		Field field = cls.getDeclaredField("s");
		
		field.setAccessible(true);
		
		field.set(obj, "JAVA");
		
		Method methodcall2 = cls.getDeclaredMethod("method1");
		
		methodcall2.invoke(obj);
		
		Method methodcall3 = cls.getDeclaredMethod("method3");
		
		methodcall3.setAccessible(true);
		
		methodcall3.invoke(obj);
	}

}
