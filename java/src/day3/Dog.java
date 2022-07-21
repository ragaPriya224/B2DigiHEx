package src.day3;

public  class Dog {
    String breed;
    String colour;
    int age;
    int cost;
    String gender = "male";

public void sleep(){
    System.out.println("dog is sleeping");
}
public void walk(){
    System.out.println("dog is walking");
}
public static void main(String[] args) {


    Dog d = new Dog();
    d.age = 3;
    d.breed ="husky";
    System.out.println(d.age);
    System.out.println(d.breed);
    System.out.println(d.colour);
    System.out.println(d.cost);

    Dog tommy = new Dog();
    tommy.age =2;
    tommy.breed ="xyz";
    tommy.colour = "black";
    System.out.println("age of tommy is:" +tommy.age);
    System.out.println("breed of tommy is:" +tommy.breed);
    System.out.println("colour of tommy is:" +tommy.colour);
}




}
