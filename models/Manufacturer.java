package javaCheckpointExersize.models;


public class Manufacturer {
    String name;


    public Manufacturer(String name) throws IllegalArgumentException{
        if (name == null) {
            throw new IllegalArgumentException("Name can't be empty");
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
}