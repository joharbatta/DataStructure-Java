class Student{
    private int id=102;  //Instance variable
    private String name;
//    char c;
    public void setId(int id)
    {
        this.id=id;
    }
    public int getId()
    {
        return this.id;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return this.name;
    }
//    public void show()
//    {
//        int id=101; //local variable
//        System.out.println(this.id);
//        System.out.println(id);
    //}
}

public class inh {

    public static void main(String args[])
    {
        Student obj=new Student();  // here new student is an object not obj new for asking class and student is constructor of class
//        obj.id=101;
//        obj.name="jatt";
////        obj.c;
////        System.out.println(obj.id);
//        obj.show();
//        System.out.println(obj.name);
//        System.out.println(obj.c);

        obj.setId(101);
        obj.setname("johar");
        int x=obj.getId();
        String y=obj.getname();
        System.out.println(x);
        System.out.println(y);
    }
}

// to acess private use getter and setter methods



//byte short int long =01
//
//float double=0.0
//
//char='\u0000'

