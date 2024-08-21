package day5.day5operators;


public class Operators {

    public static void main(String args[]){

        int a=10;
        int b=20;
        int c=30;
        int d=40;
        int sum=b+c;
        int diff=d-a;
        int multi=a*c;
        int divide=b/a;

        //without if else
        System.out.println("sum is :"+ a+b);
        System.out.println(d-c);

        //using ==    !+
        if(a==b){
            System.out.println("equal");
        }
        else if(a!=b) {
            System.out.println("not equal");
        }

        //using <=   >=
        if (c<=d) {
            System.out.println("small c");

        } else {
            System.out.println("wrong");
            
        }


       //using >   <
        if (a>d){
            System.out.println("a small");
        }
        else {
            System.out.println("correct");

        }


        // using &&   ||
        if (sum==60 && diff==30 && multi==300 || divide==3){

            System.out.println("all good");
        }
        else{
            System.out.println("all wrong");
        }

    }
}
