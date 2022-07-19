package src.day1;

public class StringDemo {
    public static void main( String[] args ){
        String city = "USA_UK_CHINA_AUSSIE";
        System.out.println(city.length());
        System.out.println(city.charAt(3));
        System.out.println(city.concat("city"));
        System.out.println(city.toLowerCase());
        System.out.println(city.toUpperCase());
        System.out.println(city.trim());
        System.out.println(city.indexOf('o'));
        System.out.println(city.indexOf('A'));
        System.out.println(city.lastIndexOf('A'));
        System.out.println(city.substring(7));
        System.out.println(city.substring(7, 9));
        System.out.println(city.startsWith("Chi"));
         System.out.println(city.endsWith("city"));
// System.out.println(city.split("_"));
System.out.println(city.replace('U', 'Z'));
String greeting = new String("hello");
    }
}
