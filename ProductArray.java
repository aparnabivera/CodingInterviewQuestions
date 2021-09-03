public class ProductArray {
    //Array of Products of All Elements Except Itself
    //Sample input arr = {1,2,3,4}
    //Sample output arr = {24,12,8,6}

    public static int[] findProduct(int arr[]) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int j = 0;
            int product = 1;
            while (j < arr.length) {
                if (j != i) {
                    product = product * arr[j];
                }
                j++;
            }
            result[i] = product;
        }

        // write your code here

        return result;
    }

    public static String arrayToString(int arr[]){
        if (arr.length > 0){
            String result = "";
            for(int i = 0; i < arr.length; i++) {
                result += arr[i] + " ";
            }
            return result;
        }
        else {
            return "Empty Array!";
        }
    }

    public static void main(String args[]) {

        int[] arr = {-1, 2, -3, 4, -5};

        System.out.println("Array before product: " + arrayToString(arr));

        int[] prodArray = findProduct(arr);

        System.out.println("Array after product: " + arrayToString(prodArray));
    }
}
