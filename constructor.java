class Student{

    private int id1;
    private String name;

    public Student(int id,String name)
    {
        id1=id;
        this.name=name;
    }
    public void setId(int id)
    {
        id1=id;
    }
    public int getId()
    {
        return this.id1;
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return this.name;
    }
}
public class constructor{
    public static void main(String args[])
    {
        Student obj=new Student(101,"abc");
        System.out.println(obj.getId());
        System.out.println(obj.getName());

    }
}

