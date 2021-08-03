public class BinarySearchonSortedArray {

    public static void main(String[] arrgs){

        int[] a = {1,10,20,47, 59, 63,75, 88,99,107, 120,133,155,162,176,188,199,200,210,222} ;

        int positionOfKey = binarySearch(a,0,a.length-1,120);
        System.out.println("The position of 120 is "+positionOfKey);

    }

    public static int binarySearch(int[] array, int low, int high, int key )
    {
        if(high<low)
            return -1;

        int mid = low +((high -low)/2);
        if(array[mid]==key)
            return mid;
        if(mid>=1)
        {
            if(key > array[mid])
            {
                return binarySearch(array,mid+1,array.length-1, key);
            }
             if(key<array[mid])
             {
                 return binarySearch(array,low,mid,key);
             }
        }
        return -1;
    }
}
