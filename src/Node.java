public class Node<E> {
    E element;
    Node<E> next;
    public Node(E newElement) {
        element = newElement;
    }
    Node<E> head= null;
    Node<E> tail= null;
    int size = 0;

    public void addElement(E element){

        Node<E> newNode = new Node<>(element);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null) {
            tail = head;
        }
    }

    public void deleteFirstNode(){
        if(size ==  0){
        }
        else{

            Node<E> temp = head;
            head = head.next;
            size --;
            if(head == null){
                tail = null;
            }
        }
    }



    public static void main(String[] args) {
        Node<Integer> firstNode = new Node<>(1);
        firstNode.addElement(2);
        firstNode.addElement(3);
        firstNode.addElement(4);
        firstNode.addElement(7);
        firstNode.addElement(5);
        firstNode.deleteFirstNode();
        System.out.println(firstNode.head.element);

    }
}


