import java.util.Arrays;

public class Array_List<E> {

    int size = 0;

    static final int DEFAULT_CAPACITY = 10;

    Object elements[];

    Array_List() {

    }

    Array_List(int newCapacity) {
        elements = new Object[newCapacity];
    }

    public void add(int index, E element) {
        if (index >= DEFAULT_CAPACITY) {
            ensureCapacity();
        } else {
            elements[index] = element;
        }
    }

    public void removeElement(int index) {
        for (int i = index; i < elements.length - 1; i++) {
                elements[i] = elements[i+ 1];
        }
    }

    public int indexOfElement(E element){
        for(int i = 0 ; i < elements.length; i ++){
            if(element.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }

    public boolean checkElement(E element) {
        for (Object findElement : elements) {
            if (element.equals(findElement)) {
                return true;
            }

        }
        return false;

    }

    public E getElement(E element){
        for (int i = 0 ; i < elements.length; i ++){
            if(element.equals(elements[i])){
                return (E) elements[i];
            }
        }

        return (E) "Can not find this Element in Array";
    }

    public void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void cloneArray(){
        Object[] newArray = Arrays.copyOf(elements,elements.length);
        for (Object element : elements){
            System.out.println(element);
        }
    }

    public void printArray() {
        for (Object element : elements) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Array_List<Integer> arrayList = new Array_List<>(10);
        arrayList.add(0, 1);
        arrayList.add(1, 5);
        arrayList.add(2, 2);
        arrayList.add(3, 4);
        arrayList.add(4, 10);

//       System.out.println( arrayList.indexOfElement(11));
       System.out.println( arrayList.getElement(10));
//        arrayList.removeElement(0);
//        arrayList.printArray();
    }
}
