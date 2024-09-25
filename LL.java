package pushpak39linkedlist;

class Node<T>{
    T data;
    Node<T> next;
    Node(T data){
        this.data =data;
        this.next=null;
    }
}
public class LL<T> {
    Node<T> head;
    LL(){
        head =null;
    }
    public  void addLast(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;//newnode alredy pointing null
        }
    }
    public void addFirst(T data){
        Node<T> newnode =new Node<>(data);
        if(head ==null){
            head =newnode;
            return;
        }
        newnode.next =head;
        head =newnode;

    }
    public void display(){
        Node<T> current =head;
        while (current !=null){
            System.out.print(current.data +" ");
            current =current.next;
        }
        System.out.println("null");
    }
    public boolean contains(T data){
        Node<T> current =head;
        while (current != null){
            if(current.data.equals(data)){
                return true;
            }
            current =current.next;
        }
        return false;
    }
    public void remove(T data){
        if(head ==null)return;
        if(head.data.equals(data)){
            head = head.next;
            return;
        }

        Node<T> curret = head;
        Node<T> previous =null;
        while (curret != null && !curret.data.equals(data)){
            previous =curret;
            curret =curret.next;
        }
        if (curret !=null){
            previous.next =curret.next;
        }
    }
    public static void main(String[] args) {
        LL<Integer> intlist =new LL<>();
        intlist.addLast(1);
        intlist.addLast(2);
        intlist.addFirst(3);
        intlist.addFirst(5);
        intlist.addFirst(7);
        intlist.addFirst(4);

        intlist.remove(4);
        System.out.println(intlist.contains(3));

        intlist.display();

    }
}



