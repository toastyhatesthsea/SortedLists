package Lists;

import java.util.List;

public class SortedLists
{

    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        return null;
    }


}

 class ListNode {
    int val;
    ListNode next;

     ListNode(int x)
     {
         val = x;
     }

     @Override
     public String toString()
     {
         return super.toString();
     }
 }

class Testers
{
    public static void main(String[] argsg)
    {
        SortedLists aListers = new SortedLists();

        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);

        l1.next = l2;

        l1.toString();


    }

}


