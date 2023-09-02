package newtojava;

public class implementation 
{  public static class node
    { 
        int data;
        node next;
        node(int data)
        {
            this.data=data;
        }

    }
 
    public static class linkedlist
    {
        node head=null;
        node tail=null;
        public void insertatend(int val) //this function ensure automatic linking linked list
        {
            node temp=new node(val);
            if(head==null)
            {
                head=temp;
            }
            else
            {
               tail.next=temp;
            }
            tail=temp;
        }
        public void insertathead(int val)
        {
            node temp=new node(val);
            if(head==null)
            {
                head=tail=temp;

            }
            else
            {
                temp.next=head;
                head=temp;
            }
        }
        public void insertatmiddle(int idx,int val)
        {   
            node t=new node(val);
            node temp=head;
            if(idx==length())
            {
                insertatend(val);
                return;
            }
            else if(idx==0)
            {
                insertathead(val);
                return;
            }
            for(int i=1;i<=idx-1;i++)
            {
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t; 
        }
        int getat(int idx)
        {   node temp=head;
            for(int i=1;i<=idx;i++)
            {   
                
                temp=temp.next;
            }
            return temp.data;
        }
        void display()   //to display 
       { node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
       }
         
       int length()
    {    node temp=head;
          int c =0;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        return c;
    }
    void deleteat(int idx)
    {
        node temp=head;
        for(int i=1;i<=idx-1;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        length--;
        
    }
    }
public static void main(String[] args)
{
    linkedlist ll=new linkedlist();
    ll.insertatend(4);
    ll.insertatend(7);
    ll.insertatend(9);
    ll.insertatend(0);
    ll.insertathead(0);
    ll.insertathead(1);
    ll.insertathead(4);
    ll.insertathead(5);
   ll.insertatmiddle(0, 8);
     ll.insertatmiddle(8, 10);
     ll.deleteat(5);
    ll.display();
   System.out.println( ll.tail.data);
}
}