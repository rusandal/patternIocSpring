package ru.minikhanov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringIoc {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Убрал, так как мы создали бин 2-ой бин Library в xml с зависимостью от бина Book
        //IoC (1 бин без зависимости) Получаем БИН из контекста spring
        //Book book = context.getBean("bookBean", Book.class);
        //Library library = new Library(book);

        //IoC|DI (2 бина с одно зависимостью)
        Library library = context.getBean("libraryBean", Library.class);

        library.readBookInLibrary();

        context.close();

    }
}
