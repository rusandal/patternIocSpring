package ru.minikhanov;

public class ChildrensBook implements Book {
    @Override
    public String readBook() {
        return "Abc";
    }
}
