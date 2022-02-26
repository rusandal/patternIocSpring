package ru.minikhanov;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringIoc {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Book book = context.getBean("bookBean", Book.class);

        //Library library = new Library(book);
        Library library = context.getBean("libraryBean", Library.class);
        library.readBookInLibrary();

        context.close();

    }
}
