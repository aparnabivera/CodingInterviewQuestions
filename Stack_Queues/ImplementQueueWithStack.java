package Stack_Queues;

public class ImplementQueueWithStack<V> {




        Stack<V> stack1;
        Stack<V> stack2;
        public ImplementQueueWithStack(int maxSize){
            // Write -- Your -- Code
            stack1 = new Stack<V>(maxSize);
            stack2 = new Stack<V>(maxSize);
        }

        public void enqueue(V value){
            // Write -- Your -- Code
            stack1.push(value);
        }
        public V dequeue(){
            // Write -- Your -- Code
            if(isEmpty())
                return null;
            else if(stack2.isEmpty()) {
                while (!stack1.isEmpty())
                    stack2.push(stack1.pop());

                return stack2.pop();
            }
            else
                return stack2.pop();

        }
        public boolean isEmpty(){
            //Write -- Your -- Code
            return (stack1.isEmpty()) && (stack2.isEmpty());
        }

    public static void main(String args[]) {

        ImplementQueueWithStack<Integer> queue = new ImplementQueueWithStack<Integer>(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);


        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(4);
        queue.enqueue(5);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(6);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue()); //this will output null because queue will be empty
    }
    }

