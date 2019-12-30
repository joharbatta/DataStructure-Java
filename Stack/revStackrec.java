import java.util.Stack;

public class revStackrec {

	static Stack<Character> s = new Stack<>();

	public static void reverse() {
		if(s.isEmpty()) {
			return;
		} else {
			char top = s.peek();
			s.pop();
			reverse();
			insertAtBottom(top);
		}

	}
	private static void insertAtBottom(char top) {
		if(s.isEmpty()) {
			s.push(top);
		} else {
			char element = s.peek();
			s.pop();
			insertAtBottom(top);
			s.push(element);
		}

	}
	private static void display() {
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
    public static void main(String[] args) 
    {
		s.push('1');
		s.push('2');
		s.push('3');
		s.push('4');
		display();
		s.push('1');
		s.push('2');
		s.push('3');
		s.push('4');
		reverse();
		display();


	}

} 