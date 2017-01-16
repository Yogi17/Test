//Gini Ilieva, CSC 143, Fall 2016
//Exercise problem #9
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class switchPairs {
	static int odd;
	
	public static Stack<Integer> switchPairs (Stack<Integer> st)
	{
		Queue<Integer> q = new LinkedList<Integer>();
		
		int stSize = st.size();
		boolean oddN = false;
		//If the the stack contains an odd number of elements
		//store the top element.
		if(stSize % 2!=0)
		{
				odd = st.pop();	
				oddN = true;
		}

		//Add the elements from the stack to the queue.
		while(!st.isEmpty())
		{
			q.add(st.pop());
			}
		//Push back the elements in the stack.
		while(!q.isEmpty())
		{
			int n = q.remove();
			int m = q.remove();
			st.push(m);
			st.push(n);
		}
		while(!st.isEmpty())
		{
			q.add(st.pop());
		}

		if(oddN==true){
			q.add(odd);
		}
		System.out.println(q);
		return st;
		
	}
	

	//Test the code.
	public static void main(String args [])
	{
		Stack <Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(8);
		st.push(6);
		st.push(-1);
		st.push(15);
		st.push(7);
		System.out.println(st);
		switchPairs(st);
	}
}
