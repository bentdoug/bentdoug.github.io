import java.util.Arrays;

/**
 * Our very own deque collection class!  
 * @param <Item> We use a "generic" so that it can be a list of any object type
 */
public class Deque<Item> {
    
    public class Node{
        private Node next;
        private Node last;
        private Item value;
        
        public Node(Item value){
            next = null;
            last = null;
            this.value = value;
        }
        
        public void updateNext(Node newNext){
            next = newNext;
        }
        
        public void updateLast(Node newLast){
            last = newLast;
        }
        
        public void setValue(Item value){
            this.value = value;
        }
        
        public Item getValue(){
            return value;
        }
    }
    
    private Node head;
    private Node tail;
    private int N;

    public Deque(){
        head = null;
        tail = null;
        N = 0;
    }
    /**
     * Add an item to the end of the deque
     * This method should run in constant time
     * @param value Item to add
     */
    public void addLast(Item value) {
        // TODO: Fill this in
        Node add = new Node(value);
        if(N==0){
            head = add;
            tail = add;
        }
        else{
            tail.updateNext(add);
            add.last = tail;
            tail = add;
        }
        
        N++;
    }
    
    /**
     * Add an item to the beginning of the deque
     * This method should run in constant time
     * @param value 
     */
    public void addFirst(Item value) {
        // TODO: Fill this in
        if(N==0){
            addLast(value);
        }
        else{
            Node add = new Node(value);
            add.updateNext(head);
            head = add;
            N++;
        }
    }
    
    /**
     * Remove and return the first item from the deque, or return
     * null if nothing is there
     * This method should run in constant time
     * @return The first item in the deque, or null if empty
     */
    public Item removeFirst() {
        // TODO: Fill this in
        if(N!=0){
            Item ret = head.getValue();
            head = head.next;
            head.updateLast(null);
            N--;
            return ret;
        }
        return null;
    }
    
    /**
     * Remove and return the last item from the deque, or return null
     * if nothing is there
     * This method should run in constant time
     * @return The last item in the deque, or null if empty
     */
    public Item removeLast() {
        // TODO: Fill this in
        if(N!=0){
            Node ret = tail;
            tail = tail.last;
            N--;
        }
        return null;
    }
    
    /**
     * Remove and return the first occurrence of an item from the 
     * deque, if it exists.  Otherwise, return null
     * (This method does not have to run in constant time, and should
     * probably use a while or do while loop)
     * @param value The value to remove
     * @return The value if found, or null if not found
     */
    public Item remove(Item value) {
        // TODO: Fill this in
        if(N!=0){
            Node current = head;
            Node next = head.next;
            while(next!=null){
                if(current==value){
                    Node ret = current;
                    current.last.updateNext(next.next);
                    next.updateLast(ret.last);
                    N--;
                    return (Item) ret;
                }
            }
        }
        return null;
    }
    
    /**
     * Return how many elements are currently stored in the deque.
     * This method should run in constant time.
     * The easiest way to do this is by storing a private variable 
     * that tracks the size as different operations are performed.
     * @return Number of elements stored in the deque
     */
    public int size() {
        // TODO: Fill this in
        return N;
    }
    
    /**
     * Return an array representation of the items in the deque.
     * If there are N elements, the array should be of length N.
     * Because of some Java weirdness, we have to return an array of
     * type Object instead of type Item, but ever class is a subclass
     * of Object, so the cast will happen automatically upon assignment
     * @return An array of items in this deque
     */
    public Object[] toArray() {
        // TODO: Fill this in
        if(N!=0){
            Object[] ret = new Object[N];
            Node node = head;
            int x = 0;
            while(node!=null){
                ret[x] = (Object) node.value;
                node = node.next;
                x++;
            }
            return ret;
        }
        return null;
    }
    
    /**
     * Clear the entire deque
     * This should run in constant time (Hint: you should
     * just have to set your head/tail to null, and everything
     * in the collection will be dereferenced)
     */
    public void clear() {
        // TODO: Fill this in
        tail = null;
        head = tail;        
    }
    
    public int getN(){
        int ret = N;
        return ret;
    }
    
    public static void main(String[] args) {
        // Put some code in here to test your method
        // implementations as you're going along
        Deque a = new Deque();
        a.addFirst(3);
        a.addFirst(5);
        a.addLast(1);
        System.out.println(Arrays.toString(a.toArray()));
        a.remove(5);
        System.out.println(Arrays.toString(a.toArray()));
        a.removeFirst();
        System.out.println(Arrays.toString(a.toArray()));
        a.removeLast();
        System.out.println(Arrays.toString(a.toArray()));
    }
}
