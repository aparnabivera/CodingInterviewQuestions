import java.util.ArrayDeque;

public class maxOfSlidingWindow {

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4, 3, 2, 1, 2, 5};
        int windowSize = 4;
        System.out.println("Maximum of sliding window of "+ windowSize+ " is "+findMaxSlidingWindow(arr,windowSize) );

    }
    public static ArrayDeque<Integer> findMaxSlidingWindow(int[] arr, int windowSize) {
        ArrayDeque<Integer> result = new ArrayDeque<>();

        if(arr.length>0 && arr.length>=windowSize ){

            for(int i=0;i<arr.length-windowSize+1;i++)
            {
                int j=i;
                for(int k=i;k<j+windowSize;k++)
                {
                    if(k==j)
                    {
                        result.addLast(arr[i]);
                    }
                    else if(arr[k]>result.getLast())
                    {
                        result.removeLast();
                        result.addLast(arr[k]);
                    }

                }

            }
        }

        //Write your code
        return result;
    }
}


