public class SearchARotatedArray {

    public static void main(String[] args)
    {
        int[] rotatedSortedArray = {4, 5, 6, 1, 2, 3};
        int key = 6;
        System.out.println("The value "+ key + " is in Array location "+binarySearchRotated(rotatedSortedArray,key));
    }
    static int binarySearchRotated(int[] arr,int key) {
        //TODO: Write - Your - Code
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]>arr[i+1])
            {
                if(key<=arr[i]&& key>=arr[0])
                {
                    return binarySearch(arr,0,i,key);
                }
                else
                    return binarySearch(arr,i+1,arr.length-1,key);
            }


        }
        return -1;
    }
    static int binarySearch(int[] arr, int low , int high, int key )
    {
        int mid = low + (high - low)/2;
        if(arr[mid] == key)
            return mid;
        while(high>low && mid>0)
        {
            if(key>arr[mid])
            {
                return binarySearch(arr,mid+1,high, key);
            }
            else
            {
                return binarySearch(arr, low, mid, key);
            }

        }
        return -1;
    }
}
