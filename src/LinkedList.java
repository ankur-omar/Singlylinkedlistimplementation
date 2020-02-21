public class LinkedList {
    Node head;
    Node tail;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }

    }
    public static LinkedList insert( LinkedList list,int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;
        if(list.head == null)
        {
            list.head = new_node;

        }
        else
        {
            Node last = list.head;
            while(last.next!= null)
            {
                last = last.next;

            }
            last.next = new_node;
        }
        return list;
    }
    public static void printList(LinkedList list)
    {
        Node currentNode= list.head;
        System.out.println("LinkedList:");
        while(currentNode !=null)
        {
            System.out.println(currentNode.data+" ");
            currentNode = currentNode.next;
        }

    }
    public void deleteFromStart() {


        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        else{
            if (head != tail) {
                head = head.next;
            }
            else {
                head = tail = null;
            }
        }
    }

    public void deleteFromEnd() {


        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {

            if(head != tail ) {
                Node current = head;

                while(current.next != tail) {
                    current = current.next;
                }

                tail = current;
                tail.next = null;
            }

            else {
                head = tail = null;
            }
        }
    }
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list = insert(list,1);
        list = insert(list,2);
        list = insert(list,3);
        list = insert(list,4);
        list = insert(list,5);
        printList(list);
        //list.deleteFromStart();

        list.deleteFromEnd();
        printList(list);
    }

}
