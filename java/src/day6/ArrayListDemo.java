package src.day6;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList cityList = new ArrayList();

        System.out.println(cityList);

        cityList.add("Delhi");
        cityList.add("newyork");
        cityList.add("mumbai");
        cityList.add("beijing");
        cityList.add("newyork"); //duplicates allowed
        cityList.add("chennai");  //insertion order preserved
        System.out.println(cityList);
        cityList.remove("beijing");
        System.out.println(cityList.contains("hyderabad"));
    //    cityList.clear();
        System.out.println(cityList.isEmpty());
      System.out.println(  cityList.size());
        System.out.println(" after removing" + cityList);
        cityList.add(2, "Lucknow");
        System.out.println(cityList);

        System.out.println("********************");
        cityList.remove(3); //remove a data 
        System.out.println(cityList);
        System.out.println(cityList.get(4));//get a data
        System.out.println(cityList.set(4, "calcutta")); //replace
      cityList.add(12);
      cityList.add(false);
      cityList.add(null);
        System.out.println(cityList);
    }
}
