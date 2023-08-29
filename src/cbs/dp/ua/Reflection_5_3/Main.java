package cbs.dp.ua.Reflection_5_3;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) {

        Class<?> cl = SomeClass.class;

        Field[] fields = cl.getDeclaredFields();

        for (Field field : fields) {
            Class <?> fieldType = field.getType();
            System.out.println(field.getName());
            System.out.println(fieldType.getName());
            if (Modifier.isPrivate(field.getModifiers())) System.out.println("private ");
            if (Modifier.isAbstract(field.getModifiers())) System.out.println("abstract ");
            if (Modifier.isFinal(field.getModifiers())) System.out.println("final ");
            if (Modifier.isProtected(field.getModifiers())) System.out.println("protected ");
            if (Modifier.isStatic(field.getModifiers())) System.out.println("static ");
            if (Modifier.isPublic(field.getModifiers())) System.out.println("public ");
            System.out.println();
        }

        System.out.println("========================================");

        Constructor<?>[] constructors = cl.getConstructors();
        int i = 0;
        for (Constructor<?> ctr : constructors ) {
            Class<?>[] paramTypes = ctr.getParameterTypes();
            System.out.print(++i + " ");
            for (Class<?> paramType : paramTypes) {
                System.out.print(paramType.getName() + " | ");
            }
            System.out.println();
        }
        System.out.println("========================================");

        Method[] methods = cl.getMethods();
        for(Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.getReturnType().getName());
            Class<?>[] paramTypes = method.getParameterTypes();
            for(Class<?> paramType : paramTypes) {
                System.out.println(paramType.getName());
            }
            System.out.println();
        }
    }
}
