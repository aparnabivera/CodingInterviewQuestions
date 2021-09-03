import java.util.HashMap;
import java.util.Map;

public class Check2Sum {

    public static int[] CheckSum(int[] array, int target)
    {

        Map<Integer,Integer> visitedNumbers = new HashMap<>();
        for(int i = 0; i<array.length; i++)
        {
            int num = target - array[i];

            if(visitedNumbers.containsKey(num))
            {
                return new int[]{i,visitedNumbers.get(num)};
            }
            visitedNumbers.put(array[i],i);

        }
        return null;
    }

    public static void main(String[] args)
    {
        int[] array = new int[]{5,8,11,4, 7, 13};
        int target = 18;
        int[] result = CheckSum(array,target);
        System.out.println("The indices of 2 numbers is "+ result[0]+"&"+result[1] );
        System.out.println(array[result[0]] +"+"+ array[result[1]] +"="+ target );
    }
}
