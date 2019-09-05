 class Animal{
    public void eat()
    {
        System.out.println("Eating");
    }
    public void drink()
    {
        System.out.println("drinking");
    }
     public void show()
     {
         System.out.println("ani");
     }
//    public abstract void show();
}
class Dog extends Animal{

    public void show()
    {
        System.out.println("Dog");
    }
}
class Cat extends Animal{
    public void show()
    {
        System.out.println("cat");
    }

}

public class Abstract{
    public static void main(String args[])
    {
        Dog d=new Dog();
        Cat c=new Cat();
        d.show();
        c.show();
        Dog obj=new Animal();
        obj.show();

    }
}