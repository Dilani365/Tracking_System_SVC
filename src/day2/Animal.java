package day2;

    class Animala {
        public void Song(){
            System.out.println("I am an Animal");
        }
    }

    class Cat extends Animala{

        public void Song(){

            System.out.println("I am a cat");
        }
    }

    class Dog extends Animala{

        public void Song(){

            System.out.println("I am a Dog");
        }
    }

    public class Animal{

        public static void main(String args[]){

            Animala a1 = new Animala();
            Animala a2 = new Cat();
            Animala a3 = new Dog();

            a1.Song();
            a2.Song();
            a3.Song();
        }
    }

