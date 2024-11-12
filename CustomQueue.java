public class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public CustomQueue(){
        this(DEFAULT_SIZE);
    }

    public CustomQueue(int size){
        this.data = new int[size];
    }

    private boolean isfull(){
        return end == data.length;
    }

    private boolean isempty(){
        return end == 0;
    }

    public boolean insert(int item){
        if (isfull()){
            System.out.println("Queue is full");
            return false;
        }
        data[end] = item;
        end++;
        return true;
    }

    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("Cannot remove from empty queue");
        }

        int remove = data[0];

        // shift elements to left
        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];
        }
        end--; 
        return remove;
    }

    public int front() throws Exception{
        if(isempty()){
            throw new Exception("Cannot remove from empty queue");
        }

        return data[0];
    }

    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();

        queue.insert(23);
        queue.insert(33);
        queue.insert(43);

        queue.display();

        System.out.println(queue.remove());
        queue.display();
    }
}
