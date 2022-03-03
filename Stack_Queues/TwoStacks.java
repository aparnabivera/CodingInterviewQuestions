package Stack_Queues;

//Implement 2 stacks using 1 array

class TwoStacks<V> {
    private int maxSize;
    private V[] array;
    private int currentsize=0;
    private int frontPointer;
    private int rearPointer;

    @SuppressWarnings("unchecked")
    public TwoStacks(int max_size) {
        this.maxSize = max_size;
        array = (V[]) new Object[max_size];//type casting Object[] to V[]
        this.frontPointer = -1;
        this.rearPointer = max_size;
    }

    //insert at top of first stack
    public void push1(V value) {
        if(isFull())
            return;

        array[++frontPointer] = value;
    }

    //insert at top of second stack
    public void push2(V value) {
        if(isFull())
            return;

        array[--rearPointer] = value;
    }

    //remove and return value from top of first stack
    public V pop1() {
        if(isEmpty())
            return null;
        return array[frontPointer--];
    }

    //remove and return value from top of second stack
    public V pop2() {
        if(isEmpty())
            return null;

        return array[rearPointer++];
    }

    public boolean isFull()
    {
        if(frontPointer == rearPointer-1){
            System.out.print("The 2 stack is full") ;
            return true;
        }
        return false;
    }

    public boolean isEmpty()
    {
        if(frontPointer == -1 && rearPointer == maxSize){
            System.out.print("The 2 stack is Empty");
            return true;
        }

        return false;
    }

}






