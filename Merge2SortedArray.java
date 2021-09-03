public class Merge2SortedArray {
    // merge arr1 and arr2 into a new result array
    public static int[] mergeArrays(int[] arr1, int[] arr2)
    {
        int sizeResultArray = arr1.length +arr2.length;
        int readHead1=0, readHead2 =0, writeHead =0;
        int[] result = new int[sizeResultArray];

        while(readHead1<arr1.length && readHead2<arr2.length)
        {
            if(arr1[readHead1]<arr2[readHead2])
            {
                result[writeHead++]=arr1[readHead1];
                readHead1++;
            }
            else
            {
                result[writeHead++]=arr2[readHead2];
                readHead2++;
            }
        }

        if(readHead1 == arr1.length-1 && writeHead<sizeResultArray-1)
        {
            for(int i=readHead2;i<arr2.length;i++)
            {
                result[writeHead++]=arr2[readHead2];
                readHead2++;
            }
        }
        else
        {
            for(int i=readHead2;i<arr2.length;i++)
            {
                result[writeHead++]=arr2[readHead2];
                readHead2++;
            }
        }

        // write your code here
        return result; // make a new resultant array and return your results in that
    }

    public static void print(int[] arr)
    {
        for(int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]) {

        int[] arr1 = {1,12,14,17,23}; // creating a sorted array called arr1
        int[] arr2 = {11,19,27};  // creating a sorted array called arr2


        System.out.println("Sorted array 1 is");
        print(arr1);

        System.out.println("Sorted array 2 is");
        print(arr2);
        int[] resultantArray = mergeArrays(arr1, arr2); // calling mergeArrays

        System.out.print("Arrays after merging: ");
        print(resultantArray);
    }
}
