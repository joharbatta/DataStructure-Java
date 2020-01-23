import java.util.*;
//rotate string2 by 2 place clock or anti to make equal to string 1
//facebook
//okfacebo
//true
class stRotate2place
{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
       //easy one
        String a=s2.substring(2)+s2.substring(0,2);
        String b=s2.substring(s2.length()-2,s2.length())+s2.substring(0,s2.length()-2);
        System.out.println("CLOCK "+a);
        System.out.println("ANTI CLOCK "+b);

        if(a.equals(s1) || b.equals(s1))
        {
            System.out.println("YA");
        }
        else
        {
            System.out.println("NO");
        }


        // //another method
        // //anticlockwise

        // StringBuilder st=new StringBuilder();
        // StringBuilder st1=new StringBuilder();
        // StringBuilder st5=new StringBuilder();
        // st5.append(s1);

        // for(int i=0;i<s2.length()-2;i++)
        // {
        //     st.append(s2.charAt(i));
        // }
        // for(int i=s2.length()-2;i<s2.length();i++)
        // {
        //     st1.append(s2.charAt(i));
        // }
        // st1.append(st);
        // System.out.println(st1);

        // //clockwise

        // StringBuilder st3=new StringBuilder();
        // StringBuilder st4=new StringBuilder();

        // for(int i=2;i<s2.length();i++)
        // {
        //     st3.append(s2.charAt(i));
        // }
        // for(int i=0;i<2;i++)
        // {
        //     st4.append(s2.charAt(i));
        // }
        // st3.append(st4);
        // System.out.println(st3);

        // if(st3.compareTo(st5)==0 || st1.compareTo(st5)==0)
        // {
        //     System.out.println("TRUE");
        // }
        // else
        // {
        //     System.out.println("FASLE"); 
        // }

    }
}