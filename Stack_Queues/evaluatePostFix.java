package Stack_Queues;

class EvaluatePostfixChallenge {
    public static int evaluatePostFix(String expression) {

        Stack<Integer> numeric = new Stack<Integer>(expression.length());

        for(int i=0; i<expression.length(); i++)
        {
            char character = expression.charAt(i);
            if(!Character.isDigit(character))
            {
                int x = numeric.pop();
                int y = numeric.pop();
                switch(character)
                {
                    case '*': numeric.push(x * y);
                        break;
                    case '/': numeric.push(y/x);
                        break;
                    case '-': numeric.push(y-x);
                        break;
                    case '+': numeric.push(x+y);
                        break;

                }

            }else
                numeric.push(Character.getNumericValue(character));
        }
        return numeric.pop();
    }
    public static void main(String args[]) {

        System.out.println(evaluatePostFix("921*-8-4+"));
    }
}
