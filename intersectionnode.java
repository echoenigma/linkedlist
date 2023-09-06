package newtojava;

public class intersectionnode 
{     int dif1,dif2;
    public static class node
    {
        int data;
        node next;
        node(int data)
        {
        this.data=data;
        }
    }
    public node intersected(node heada, node headb )

    {   
        int lengtha=0,lengthb=0;
        node tempa=heada;
        node tempb=headb;
        while(tempa!=null)
        {
            lengtha++;
            tempa=tempa.next;
        }
        while(tempb!=null)
        {
            lengthb++;
            tempb=tempb.next;
        }
        tempa=heada;
        tempb=headb;
        if(lengtha>lengthb)
        {
             dif1=lengtha-lengthb;
             for(int i=1;i<=dif1;i++)
             {
                tempa=tempa.next;
             }
        }
        else if(lengthb>lengtha)
        {
          dif2=lengthb-lengtha;
          for(int i=1;i<=dif2;i++)
          {
             tempb=tempb.next;
          } 
        }
        while(tempa!=tempb)
        {
            tempa=tempa.next;
            tempb=tempb.next;
        }
        return tempa;
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
    node x=new node(5);
    node y=new node(1);
    x.next=y;
    y.next=c;
    intersectionnode ll=new intersectionnode();
    node q=ll.intersected(a, x);
    System.out.print(q.data);
 }   
}
