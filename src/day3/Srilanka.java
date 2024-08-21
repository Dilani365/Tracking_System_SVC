package day3;

import static day3.India.hello;
import static day3.India.house;

public class Srilanka {

    static String city = "WTC";
    static String city2 = "Templetree";

    public static void main(String[] args)
    {
        India India1 = new India();
        India1.Chennai(city,city2);
        Matara();
        India1.Mumbai();
        Colombo(hello,house);
        System.out.println("I am in main method");
    }

    public static void Colombo(String gift, String shouse){
        System.out.println("I am in colombo");
        System.out.println("We are in " + gift);
        System.out.println("We are in " + shouse);
    }

    public static void Matara(){
        System.out.println("I am in matara");
    }


}
