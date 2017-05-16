package test; /**
 * Created by Marcin Gumkowski on 2017-02-19.
 */

import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import static java.lang.System.out;

import java.lang.reflect.*;
import java.util.Set;


class Bar {
    public String fun(Integer i) {
        return "0" + i + ", zglos sie!";
    }
}


public class Reflex {
    public static void main(String[] args) throws Exception {
        Reflections reflections = new Reflections(".*", new SubTypesScanner(false));

        Set<Class<? extends Object>> allClasses =
                reflections.getSubTypesOf(Object.class);

        String className = "Bar";
        Class c = Class.forName(className);
        Method[] m = c.getDeclaredMethods();
        for (int i = 0; i < m.length; ++i) {
            out.print("Klasa " + className + " ma metode '" + m[i].getName().toString() + "'");
            out.println(" ktora zwraca wartosc typu " + m[i].getReturnType().toString());
            out.println(" ktora zwraca wartosc typu " + m[i].toGenericString().toString());
        }
    }
}