package ru.minikhanov;

public class ChildrensBook implements Book {
    public void doInit(){
        System.out.println("Doing my initialization");
    }

    public void doDestroy(){
        System.out.println("Doing my destroy");
    }

    @Override
    public String readBook() {
        return "Abc";
    }
}
