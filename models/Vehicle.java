package javaCheckpointExersize.models;

public class Vehicle {
    String name;
    String color;
    String year;

    public Vehicle(String name, String color, String year) throws IllegalArgumentException{
        if (name == null || color == null || year == null) {
            throw new IllegalArgumentException("Some of the parameters are empty");
        } else {
            this.name = name;
        }
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void prettyPrint(){
        System.out.println("\n Car model: " + this.name);
        System.out.println("\n Color: " + this.color);
        System.out.println("\n Year : " + this.year);
    }
}