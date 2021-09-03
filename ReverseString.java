public class ReverseString {

    public static String reverse(String target)
    {
        StringBuilder reversedString = new StringBuilder();
        for(int i=target.length()-1; i>=0; i--)
        {
            reversedString.append(target.charAt(i));
        }

        return reversedString.toString();
    }

    public static void main (String[] args)
    {
        String value = "good morining";
        String result = reverse(value);

        System.out.println("the reversed string is "+ result);

    }

}
