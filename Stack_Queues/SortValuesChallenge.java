package Stack_Queues;

class SortValuesChallenge {
    public static void sortStack(Stack<Integer> stack) {

        Stack<Integer> temp = new Stack<Integer>(stack.getMaxSize());

        while(!stack.isEmpty())
        {
            int val = stack.pop();

            if(!temp.isEmpty()&& temp.top()<val)
            {
                temp.push(val);
            }
            else
            {
                while(!temp.isEmpty() &&  val < temp.top())
                    stack.push(temp.pop());
                temp.push(val);
            }

        }

        while(!temp.isEmpty())
        {
            stack.push(temp.pop());
        }






        // Write -- Your -- Code
    }

    public static void main(String args[]) {

        Stack<Integer> stack = new Stack<Integer>(7);
        stack.push(2);
        stack.push(97);
        stack.push(4);
        stack.push(42);
        stack.push(12);
        stack.push(60);
        stack.push(23);
        sortStack(stack);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
