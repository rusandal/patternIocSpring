package ru.minikhanov;

public class ChildrensBook implements Book {
    public void doMyInit(){
        System.out.println("Doing init bean");
    }

    public void doDestroyBean(){
        System.out.println("Doing destroy bean");
    }

    @Override
    public String readBook() {
        return "Abc";
    }
}
