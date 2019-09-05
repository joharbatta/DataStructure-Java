class Student{

        public static int count=0;

        public void inc()
        {
            this.count++;
        }
        public void show()
        {
            System.out.println(this.count);
        }
}
public class Static{

    public static void main(String[] args)
        {
            Student s1=new Student();
            Student s2=new Student();
            Student s3=new Student();
            s1.inc();
            s2.inc();
            s3.show();
            System.out.println(s3.count);
            //here count is public so we can acess but if we change to private it gonna show error

        }
}