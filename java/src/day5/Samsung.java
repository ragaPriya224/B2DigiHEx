package src.day5;

public class Samsung extends Mobile{

    @Override
    public void text() {
      System.out.println("welcome samsung user");
        
    }

    @Override
    public void m2() {  
        System.out.println("m23");
        
    }
    public static void main(String[] args) {
      Samsung samsung = new Samsung();
      samsung.text();
    }
    
}
