public class Animalx
        {
        public static void main(String[] args){
        System.out.println("There are Pandas and Zebra");
        Animal a=new Animal();
        Panda p=new Panda();
        Zebra z=new Zebra();
        
        a.zoo();
        p.zoo();
        z.zoo();
        }
        }

class Animal
{
    void zoo(){
        System.out.println("Animal live in zoo");}
}

class Panda extends Animal
{
void zoo(){
System.out.println("Panda are white and black");}
}

class Zebra extends Animal
{
void zoo(){
System.out.println("Zebra is Black and White");}
}
