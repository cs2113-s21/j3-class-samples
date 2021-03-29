import java.lang.Iterable;
import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{

    private Node head;
    
    private class Node{
        Node next;
        T data;
    }

    public LinkedList(){
        head=null;
    }

    public void addToHead(T data){
        Node n = new Node();
        n.data=data;
        n.next = this.head;
        this.head = n;            
    }

    public Iterator<T> iterator(){
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<T>{
        private Node curNode;
        public LinkedListIterator(){
            curNode=head;
        }
        public boolean hasNext(){
            return curNode != null;
        }
        public T next(){
            T data = curNode.data;
            curNode = curNode.next;
            return data;
        }
    }
}
