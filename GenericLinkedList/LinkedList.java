//A Generics Linked List: Written in java, for fun and practice. Argenis Lamadrid


public class  LinkedList<E extends Comparable<E>>{
    // Start inner class
    private class Node<T>{
        T data;
        Node <T> next;
    
        // Creates new node, next is set to null
        public Node(T data){
            this.data = data;
            next = null;
        }
    }
    ////End inner class
    private int currentSize;
    Node<E> head;
    Node<E> tail;
    
    public LinkedList(){
        int currentSize = 0;
        head = tail = null;
    }

    //Adds to the front of the list
    public void append(E obj){
        Node<E> newNode = new Node<E>(obj);
        
        if(isEmpty()){
            head = tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
        
        currentSize++;
    }
    
    //Clears the list
    public void clear(){
        head = null;
    }
    
    //Checks to see if an element is inside of the list
    public boolean contains(E obj){
        Node<E> current = head;
        
        while(current != null){
            if(obj.compareTo(current.data) == 0){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
    //Returns the current size of the list
    public int getSize(){
        return currentSize;
    }
    
    //Returns true if the list is empty
    public boolean isEmpty(){
        return currentSize == 0;
    }
    
    //Returns head node data
    public E peekTop(){
        return head.data;
    }
    
    // Returns tail node data
    public E peekTail(){
        return head.data;
    }
    
    //Removes specified element from the list, if it exists
    public boolean remove(E obj){
        Node<E> current = head;
        Node<E> previous = head;
        
        //Check to see if list is empty
        if(isEmpty()){
            return false;
        }
        
        //Check to see if head is object to be removed
        if(obj.compareTo(current.data) == 0){
            head = head.next;
            if(head == null){
                tail = null;
            }
            currentSize--;
            return true;
        }
        
        //Checks to see if object to be removed is in the middle or end
        while(current != null){
            if(obj.compareTo(current.data) == 0){
                previous.next = current.next;
                currentSize--;
                if(head == null){
                    tail = null;
                }
                return true;
            }
            previous = current;
            current = current.next;
        }
        
        return false;
    }
    
    //Removes and return first element in the list
    public E removeTop(){
        if(isEmpty()){
            return null; 
        }
        
        E temp = head.data;
        head = head.next;
        currentSize--;
        return temp;
    }
    
    //Removes and returns last element in the list 
    public E removeTail(){
       Node<E> current = head;
       Node<E> previous = head;
       E temp = tail.data;
       
       if(isEmpty()){
           return null;
       }
       
       //Traverses list to get previous to last element
       while(current != tail){
           previous = current;
           current = current.next;
       }
       previous.next = null;
       tail = previous;
       currentSize--;
       return temp;
    }
    
    //Prints the list(only ints and strings for now)
    public void print(){
        Node current = head;
        
        if(currentSize == 0){
            System.out.println("Empty List");
            return;
        }
        
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
        
        System.out.println("End List");
    }
}
