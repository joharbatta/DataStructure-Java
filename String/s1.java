public class s1{
    public static void main(String args[])
    {
        //false answer as both as different obj as we use new memory make new object
        // but if we use s1.equals(s2) its true
        // also in " " here we have true false it also creates 2 objects " " creates string objects
        String s1=new String("abc");
        String s2=new String("abc");

        if(s1==s2)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

//        // Here we got answer true both refers same obj
//        String s1="abc";
//        String s2="abc";
//        if(s1==s2)
//        {
//            System.out.println("True");
//        }
//        else
//        {
//           System.out.println("False");
//
//        }



    }

}