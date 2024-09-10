package org.example;

public class Car implements Vehicle{
    /* This is an intinsic state
    1. It is not supplied by cliend
    2. It is independent of the flyweight context.
    3. This can be shared accross.
    4. These data are often immutable.
    * */
    private String description;

    /* The vehicleFactory will  supply this
    inside the flyweight object.
    * */

    public Car(String description) {
        this.description = description;
    }

    @Override
    public void aboutMe(String color) {
        System.out.println(description+" with "+color+" color.");
    }
}
