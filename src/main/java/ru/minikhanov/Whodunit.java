package ru.minikhanov;

public class Whodunit implements Book {
    @Override
    public String readBook() {
        return "Murder on Express";
    }
}
