package src.day5;

public class Dog implements AnimalInterface ,HumanInterface{

    @Override
    public void sound() {
       System.out.println("bow bow ");
        
    }

    @Override
    public void food() {
        System.out.println("bones");
        
    }

    @Override
    public void walk() {
        // TODO Auto-generated method stub
        
    }

   
    
}
