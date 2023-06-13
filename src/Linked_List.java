public class Linked_List<E> {
    Node head;
    int nodeNumber;
    Linked_List(E element){
        head = new Node(element);
        nodeNumber++;
    }

    private static class Node {
        private Node next;
        private Object data;

        public Node (Object data){
            this.data = data;

        }
        public Object getNode(){
            return this.data;
        }

    }

    public Object addElementAtIndex(int index, Object element){

        Node temp = head;
        Node newNode;
          for(int i=0; i < index-1 && temp.next != null; i++) {
              temp = temp.next;
          }
          newNode = temp.next;
          temp.next = new Node(element);
          temp.next.next = newNode;
          nodeNumber++;
         System.out.println("Add Element at index : %d%nwith element  %d success".formatted(index,element));
        return element;
    }

    public void addFirstElement(E element){
        Node temp = head;
         head = new Node(element);
        head.next = temp;
        nodeNumber ++;
        System.out.println("Element %d add to the first Node of LinkedList Success".formatted(element));
    }

    public Node getNode(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
//        System.out.println("Element at index %d is %d".formatted(index,temp.data));
        return temp;
    }

    public void showList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }



    public static void main(String[] args) {
        Linked_List<Integer> list = new Linked_List<Integer>(10);
        list.addElementAtIndex(2,1);
        list.addElementAtIndex(3,2);
        list.addElementAtIndex(5,11);
        list.addFirstElement(5);
        list.addFirstElement(6);
//        list.getNode(5);
        list.showList();
//        System.out.println(list.nodeNumber);
    }


}
