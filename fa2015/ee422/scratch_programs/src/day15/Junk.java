package day15;

import java.lang.reflect.Constructor;

public class Junk {
	public static void main (String [] args) {
		Class<?> myClass = null;
		try {
			myClass = Class.forName("MyClass");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Constructor<?> constructor = null; 
		try {
			constructor = myClass.getConstructor();
		} catch (NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		Object instanceOfMyClass = null;
		try {
			instanceOfMyClass = constructor.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();	
		} catch (IllegalAccessException e) {
			e.printStackTrace();	
		} catch (IllegalArgumentException e) {
			e.printStackTrace();	
		} catch (InvocationTargetException e) {
			e.printStackTrace();	
		}

	}
}
