package newtojava;

public class deletenode 
{  public static class node
    {
        int data;
        node next;
        node(int data)
        {
        this.data=data;
        }
    }
    void display(node head)
    {
          node temp=head;
          while(temp!=null)
          {
            System.out.print(temp.data+"  ");
            temp=temp.next;
          }
    }
    public void deletenodend(node head ,int n)
    {
         node slow=head;
         node fast=head;
         for (int i = 1; i <= n; i++) 
         {
            fast=fast.next;
         }
         while(fast.next!=null)
         {
            slow=slow.next;
            fast=fast.next;
         }
         slow.next=slow.next.next;

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
     deletenode ll=new deletenode();
     ll.display(a);
     ll.deletenodend(a, 2);
     System.out.println();
     ll.display(a);
    }    
    
}

