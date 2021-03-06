import java.util.*;
class stack
{
	private int a[],capacity,size,top;
	stack(int cap)
	{
		this.a=new int[cap+1];
		this.capacity=cap;
		this.size=0;
		this.top=0;
	}
	public void push(int elem)
	{
		if(isfull())
			System.out.println("Stack full");
		else
		{
		//if(size==0)
			//a[0]=elem;
		//else
		{
			int back=size;
			while(back>top)
			{
				a[back]=a[back-1];
				back--;
			}
			a[top]=elem;
			this.size++;
			}
		}
	}
	public int pop()
	{
		if(this.isempty())
		{
			//System.out.println("Stack empty");
			return -99;
		}
		else
		{
			int e=a[top];
			int back=top;
			while(back<size)
			{
				a[back]=a[back+1];
				back++;
			}
			size--;
			return e;
			}
		
		}
	public void display()
	{
		if(isempty())
			System.out.println("Stack empty\n");
		else
		{
			int i=top;
			System.out.print("Stack : ");
			while(i<size)
			{
				System.out.print(a[i]+ " ");
				i++;
			}
		}
	}
		
	public boolean isempty()
	{
		if(size==0)
			return true;
		else
			return false;
	}
	public boolean isfull()
	{
		if(size>=capacity)
			return true;
		else
			return false;
	}
	
}
public class stackop {
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter capacity of the stack");
		int cap=input.nextInt();
		stack s=new stack(cap);
		while(true)
		{
		System.out.println("\n1.Push\n2.Pop\n3.Display\nAny Other to exit");
		int ch=input.nextInt();
		if(ch==1)
		{
			System.out.println("Enter the element to push");
			int e=input.nextInt();
			s.push(e);
		}
		else if(ch==2)
		{
			int q=s.pop();
			if(q==-99)
				System.out.println("Stack empty");
				
			else
				System.out.println("Popped element= "+q);
		}
		else if(ch==3)
			s.display();
		else
			break;
	}
		input.close();
			
	
		
	}

}
