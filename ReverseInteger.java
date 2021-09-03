import java.util.Scanner;

public class ReverseInteger {

    public static int reverse(int num)
    {
        int result = 0;
        while(num!=0)
        {
            int val = num % 10;
            num = num/10;
            result = result*10 + val;
        }

        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE)
        {
            throw new RuntimeException("Invalid input");
        }

        return result;
    }

    public static void main(String[] args)
    {

        Scanner obj = new Scanner(System.in);
        System.out.println("Input a number to be reversed");
        int num = obj.nextInt();

        System.out.println("The reversed number is "+reverse(num));

    }

}
