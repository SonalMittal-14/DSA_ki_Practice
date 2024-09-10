public class LinkedList{

  Node head;
  class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
        this.next = null;
    }
  }

  public void insertkarenge(int val){
    Node newNode = new Node(val);
    if(head == null){
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
  }

  public void display(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.val + "->");
        temp = temp.next;
    }
    System.out.println("null");
  }


  
    public static void main(String[] args) {
        LinkedList listBnao = new LinkedList();
        listBnao.insertkarenge(1);
        listBnao.insertkarenge(2);
        listBnao.insertkarenge(3);
        listBnao.insertkarenge(4);
        listBnao.display();
    }
}