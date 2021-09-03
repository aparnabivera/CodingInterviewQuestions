import java.util.Scanner;

public class Stack {

    int top;
    int size;
    int[] array;

    public Stack(int size) {
        this.top = -1;
        this.size = size;
        this.array = new int[size];
    }

    public void push(int val)
    {
        if(isFull())
        {
            System.out.println("Stack is full");
            System.exit(1);
        }


            array[++top] = val;


    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean isFull()
    {
        return top == size -1;
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
            System.exit(1);
        }

        return array[top--];
    }

    public int peep()
    {
        return array[top];
    }

    public void print()
    {
        for(int i = top ; i>=0; i--)
        {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args)
    {
        //Scanner obj = new Scanner(System.in);
        //System.out.println("The size of the stack is");
        //int size = obj.nextInt();

        Stack test = new Stack(5);
        test.push(4);
        test.push(7);
        test.push(9);
        test.push(12);
        test.push(15);

        test.print();

        System.out.println("pop "+test.pop());
        test.print();
        System.out.println("peep "+test.peep());
        test.print();


    }


}
