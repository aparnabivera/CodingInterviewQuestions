package LeetCodeInterviewQuestions;

public class StringToInteger {

    public int myAtoi(String s) {


        double result =0;
        int i=0,sign =1;
        while(i<s.length())
        {
            if(s.charAt(i)=='-')
            {
                sign = -1;
            }

            if(Character.isDigit(s.charAt(i)))
            {
                result = result*10 + Character.getNumericValue(s.charAt(i));
            }
            i++;
        }

        if(result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if(result< Integer.MIN_VALUE)
            return Integer.MIN_VALUE;




        return sign*(int)result;
    }

}
