import java.util.*;
class Main
{
    Node head;// global variable
    Node temp;// global variable
    Node prenode;
    int c =0;// global variable
    class Node
    {
        int data;// Node data
        Node next;// Node pointer
        Node(int data){// Node constructor
            this.data =data;
            this.next =next;
        }
    }


    public void insert(int val)// insert Method
    {

        Node newnode =new Node(val);

        if(head==null){
            head =temp =newnode;
        }
        else{
            temp.next =newnode;
            temp =newnode;


        }
    }

    public void insert_begining(int val){// insert Node at begining
        Node newnode =new Node(val);
        if(head==null){
            head =newnode;

        }
        else{
            newnode.next =head;
            head =newnode;
        }
    }

    public void insert_end(int val)// insert node at the end
    {
        Node newnode =new Node(val);
        if(head==null){
            head =newnode;
        }
        else{
            temp =head;
            while(temp.next!=null){

                temp =temp.next;


            }
            temp.next =newnode;
            newnode.next =null;
        }
    }
    public void count(){// count the number of nodes
        if(head==null)
        {
            return;
        }
        else{
            temp =head;
            while(temp!=null){

                c =c+1;
                temp =temp.next;






            }
            System.out.println("count is " +c);
        }
    }
    public void insert_location(int pos,int val)// insert node at given particular position
    {
        Node newnode =new Node(val);

        int i=1;
        if(pos>c){
            System.out.println("position not found");// generate error when position not matched

        }
        else{
            temp =head;
            while(i<pos){
                temp =temp.next;
                i++;
            }
            newnode.next =temp.next;
            temp.next =newnode;

        }
    }

    public void delete_begining()// delete node from begining
    {
        if(head==null){
            System.out.println("linkedlist is empty:");
        }
        else{
            temp =head;
            head =head.next;

        }
    }

    public void delete_end(){// delete node from end
        temp =head;


        if(head==null){
            return;
        }
        else{
            while(temp.next!=null){
                prenode = temp;
                temp =temp.next;

            }
            if(temp==head){
                head=null;
            }
            else{
                prenode.next =null;
            }
        }
    }

    public void delete_location(int pos){
        int i =1;
        Node nodenext =null;
        if(pos>c){
            System.out.println("Node is not found in that given postion:");
        }
        else{
            temp =head;
            while(i<pos-1){
                temp =temp.next;
                i =i+1;


            }
            nodenext =temp.next;
            temp.next =nodenext.next;


        }
    }

    public void printList() // print function
    {
        Node temp = head;
        while (temp!= null)
        {
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }

    public static void main(String[] args){// main function
        Main l =new Main();// class object
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.insert_begining(6);
        l.insert_end(7);
        l.count();
        l.insert_location(3,9);
        l.delete_begining();
        l.delete_end();
        l.delete_location(3);
        l.printList();
    }

}
