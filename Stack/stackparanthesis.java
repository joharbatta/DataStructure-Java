import java.util.*;
import java.util.Stack;
public class stackparanthesis {

	public static void main(String[] args)
	{
		
		Stack<Character> stack=new Stack<Character>();
		Scanner s1=new Scanner(System.in);
		System.out.print("Enter the String containing brackets : ");
		String arr=s1.nextLine();
		if(arr.length()%2!=0)
		{
			System.out.println("String is Not Balanced");
			
		}
		else
		{
		for(int i=0;i<arr.length();i++)
		{
			char ch=arr.charAt(i);
			if(ch=='{' || ch=='[' || ch=='(')
			{
				stack.push(ch);
			}
			else 
			{
				if(!stack.isEmpty())
				{
					char c=stack.peek();
					if((ch=='}' && c=='{') || (ch==']' && c=='[') ||(ch==')' && c=='('))
					{
						stack.pop();
					}
				}
			}
		}
		if(stack.isEmpty())
		{
			System.out.println("String is Balanced");
		}
		else
		{
			System.out.println("String is Not Balanced");
		}
		
	}
}

}