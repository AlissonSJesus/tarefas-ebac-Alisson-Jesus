package br.com.ali.reflections;

public class App {
    public static void main(String[] args) throws Exception {
        Class<?> firstClass = Class.forName("br.com.ali.reflections.FirstClass");

        if(firstClass.isAnnotationPresent(Table.class)) {
            String value = firstClass.getAnnotation(Table.class).value();
            System.out.println(value);
        }
    }
}
