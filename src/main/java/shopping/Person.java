package shopping;

public class Person {
    private String name;


    //constructor (used to create new objects for your classes variables)
    public Person(String name) {
        this.name = name;
    }


    //setters and getters (used to access private variables outside their class)
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


}
