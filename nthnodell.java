package newtojava;

public class nthnodell
{
   public static class node
   {
    int data;
    node next;
    node(int data)
    {    
        this.data=data;
    }
   } 
   
   public  node findnthnode(node head, int n)
   {
     node slow=head;
     node fast=head;
     for(int i=1;i<=n;i++)
     {
        fast=fast.next;
     }
     while (fast!=null) 
     {
        slow=slow.next;
        fast=fast.next;
     }
     return slow;
   }
   public static void main(String[] args)
 {  
    node a=new node(2);
    node b=new node(8);
    node c=new node(3);
    node d=new node(7);
    node e=new node(6);
    node f=new node(9);
    a.next=b;
    b.next=c;
    c.next=d;
    d.next=e;
    e.next=f;
    nthnodell ll=new nthnodell();
    node q=ll.findnthnode(a,5);
    System.out.println(q.data);
 }

}
