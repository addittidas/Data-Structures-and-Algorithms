public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if (isfull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception{
        if(isempty()){
            throw new Exception("Cannot pop from empty stack");
        }

        int remove = data[ptr];
        ptr--;
        return remove;
    }

    public int peek() throws Exception{
        if(isempty()){
            throw new Exception("Cannot peek from empty stack");
        }
        return data[ptr];
    }

    private boolean isfull(){
        return ptr == data.length - 1;
    }

    private boolean isempty(){
        return ptr == -1;
    }

    public static void main(String[] args) throws Exception{
        CustomStack stack = new CustomStack(5);
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
