public class s2{

    public static void main(String args[])
    {
        String str=new String(" Hello World  ");
        String x=new String("e");

        System.out.println(x.isEmpty());
        System.out.println(str.charAt(3));
        System.out.println(str.toUpperCase());
        System.out.println(str.indexOf(""));
        System.out.println(str.trim());// remove extra space before and after string

        char[] ch=str.toCharArray();

        for(int i=0;i<ch.length;i++)
        { System.out.print(ch[i]+" ");
        }

        str.toLowerCase();



}
}