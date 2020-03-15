import java.util.*;
import java.util.Stack;
class stackReverse {

	static Stack<Character> s=new Stack<>();
	static void reverse()
	{
		if(s.isEmpty())
		{
			return;
		}
		char a=s.pop();
		reverse();
		insertBottom(a);
	}
	static void insertBottom(char a)
	{
		if(s.isEmpty())
		{
			s.push(a);
			return;
		}
		char b=s.pop();
		insertBottom(a);
		s.push(b);

	}
	public static void main(String[] args) {
	
			Scanner in = new Scanner(System.in);
			// String ans = "",
			String data = in.nextLine();
			
			for (char element : data.toCharArray()) 
			{
	            s.push(element);
	        }
			reverse();
	        // for (char element : data.toCharArray()) {
	        //     ans += s.pop();
	        // }
	        System.out.print(s);
	}

}