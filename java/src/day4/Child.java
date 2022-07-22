package src.day4;

public class Child extends Parent {
    public static void main(String[] args) {

        Child child = new Child();
        child.wealth();
        child.toMarry();
        child.home();
      
        // Parent parent = new Parent();
        // parent.home();
    }

    // public void toMarry() {
    //     System.out.println("user2");
    // }

    public void home() {
        super.home();
        System.out.println("sofa");
    }
}
