public class CheckRemoveEven {

    public static int[] removeEven(int[] arr) {

        int oddelements=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                oddelements++;
            }
        }
        int[] result = new int[oddelements];
        int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)
            {
                result[j++]=arr[i];
            }
        }

        // Write - Your - Code- Here
        return result; // change this and return the correct result array
    }

    public static void print(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }



    public static void main(String[] args)
    {
        int[] array = {3,8,4,5,33,53,7,8,22,13,16,27};
        System.out.println("Input array");
        print(array);

        int[] oddArray = CheckRemoveEven.removeEven(array);

        System.out.println("The odd array is");
        print(oddArray);
    }
}
