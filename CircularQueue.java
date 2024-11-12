public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;
    private int size = 0;

    public CircularQueue(){
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size){
        this.data = new int[size];
    }

    private boolean isfull(){
        return size == data.length;
    }

    private boolean isempty(){
        return size == 0;
    }

    public boolean insert(int item){
        if (isfull()){
            System.out.println("Queue is full");
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isempty()){
            throw new Exception("Cannot remove from empty queue");
        }

        int remove = data[front++];
        front = front % data.length;
        size--;
        return remove;
    }

    public int front() throws Exception{
        if(isempty()){
            throw new Exception("Cannot remove from empty queue");
        }

        return data[front];
    }

    public void display(){
        if (isempty()){
            System.out.println("Empty");
            return;
        }   
        int i = front;
        do {
            System.out.print(data[i] + " ");
            i++;
            i %= data.length;
        } while(i != end);
        System.out.println("END");
        
    }

    public static void main(String[] args) throws Exception {
        CircularQueue queue = new CircularQueue(5);

        queue.insert(23);
        queue.insert(33);
        queue.insert(43);

        queue.display(); 

        System.out.println(queue.remove());
        queue.display();
    }
}
