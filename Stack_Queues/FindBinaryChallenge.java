/*Generate Binary Numbers from 1 to n using Queue*/
package Stack_Queues;


import java.util.LinkedList;
import java.util.Queue;

public class FindBinaryChallenge {
    public static String[] findBin(int number) {
        String[] result = new String[number];
        Queue<String> binary = new LinkedList<>();

        binary.add("1");

        for(int i=0; i<number; i++)
        {
            String val = binary.remove();
            result[i] = val;
            String set1 = val + "0";
            String set2 = val + "1";
            binary.add(set1);
            binary.add(set2);
        }
        // Write -- Your -- Code
        return result; //For number = 3 , result = {"1","10","11"};
    }

    public static void main(String args[]) {

        String[] output = findBin(3);
        for(int i = 0; i < 3; i++)
            System.out.print(output[i] + " ");
    }
}