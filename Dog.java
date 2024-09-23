public class Dog {
    private String name;
    private String breed;
    private int age;

    // Constructor to initialize the dog's attributes
    public Dog(String name, String breed, int age){
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    // Overridden toString method to display the dog's details
    @Override
    public String toString(){
        return String.format("(애칭) %s, (견종) %s, (나이) %d", name, breed, age);
    }

    // Method to simulate the dog barking
    public void barking(){
        System.out.println("멍멍!");
    }
}
