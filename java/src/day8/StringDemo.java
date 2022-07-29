package src.day8;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println("***************");

        String s1 = new String("D");
        String s2 = new String("D");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        /**
         *   == is used for reference or address comparison 
         *   .equals is used for content comparison 
         * 
         * 
         * 
         */

         String s = new String("hello");
         s.concat("world");
         System.out.println(s); // no changes in existing object. 
         //changes na it will create  new object, so ref variable, so gC

         
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        System.out.println(s3 == s4);  //false
        System.out.println(s3.equals(s4)); // true

        String s5 = new String("phone");
        String s6 = "charger";

        StringBuffer s7 = new StringBuffer("jurassic");
        s7.append("park");
        System.out.println(s7);

        String s9 = new String("Thanos");
        String s10 = new String("Thanos");
        System.out.println(s9 == s10);//false
        System.out.println(s9.equals(s10)); //true

        StringBuffer s11 = new StringBuffer("Thanos");
        StringBuffer s12 = new StringBuffer("Thanos");
        System.out.println(s11 == s12);//false
        System.out.println(s11.equals(s12)); //false   . not overriden. 



        
    }
}
