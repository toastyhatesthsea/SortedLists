package Lists;

import java.util.List;

public class SortedLists
{

    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        ListNode answer = new ListNode(0);
        ListNode current = l1;


        while (current != null)
        {
            int l1Value = current.val;
            int l2Value = l2.val;

            ListNode l2Link = l2.next;

            if (l1Value >= l2Value)
            {
                ListNode aNewValue = new ListNode(l2Value);
                aNewValue.next = current;
                l2 = l2.next;
            }
            else
            {
                ListNode l2NextNode = current.next;
                ListNode aNewValue = new ListNode(l2Value);
                current.next = aNewValue;
                aNewValue.next = l2NextNode;
            }

        }

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


