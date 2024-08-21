package day2;
//Three program in one

/*class day2.Srilanka extends day2.India
{

    public void Colombo()
    {
        System.out.println("I am in Colombo");
    }

    public void Matara()
    {
        System.out.println("I am in Matara");
    }
}

  class day2.India
 {
     public void Mumbai()
     {
         System.out.println("i am in Mumbai");
     }

     public void Chennai()
     {
         System.out.println("i am in Chennai");
     }
 }*/

public class Mymain
{
    public static void main(String args[])
    {
        Srilanka S1 = new Srilanka();

        S1.Chennai();
        S1.Matara();
        S1.Mumbai();
        S1.Colombo();

        System.out.println("I am in main methid");

    }
}
