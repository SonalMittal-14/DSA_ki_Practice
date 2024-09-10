public class insertLast{

    Node head;
    class Node{
      int val;
      Node next;
      Node(int val){
          this.val = val;
          this.next = null;
      }
    }


    public void inertLastKarenge(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
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
        insertLast listBnao = new insertLast();
        listBnao.inertLastKarenge(1);
        listBnao.inertLastKarenge(2);
        listBnao.inertLastKarenge(3);
        listBnao.inertLastKarenge(4);
        listBnao.inertLastKarenge(5);
        listBnao.display();

        int left = 2;
        int right = 4;

        Node temp = listBnao.head;

        for (int i = 0; i < left-1; i++) {
            temp = temp.next;
        }

        Node ptr = null;
        for (int i = left; i < right; i++) {
            Node next = temp.next;
            temp.next = ptr;
            ptr = temp;
            temp = next;
        }

        



       
        
        

    
        listBnao.display();
      }
  }