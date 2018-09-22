package Lists;

import java.util.List;

public class SortedLists
{

    /**
     * Merge two sorted linked lists and return it as a new list.
     * The new list should be made by splicing together the nodes of the first two lists.
     * @param l1 ListNode
     * @param l2 ListNode
     * @return ListNode
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        ListNode answer = null;
        ListNode original = answer;
        ListNode current = l1;
        ListNode previous = l1;

        if (l1 == null || l2 == null)
        {
            return l2 == null ? l1 : l2;
        }

        while (l1 != null && l2 != null)
        {
            int l1Value = l1.val;
            int l2Value = l2.val;
            int valueToAdd;

            if (l1Value <= l2Value)
            {
                valueToAdd = l1Value;
                l1 = l1.next;
            }
            else
            {
                valueToAdd = l2Value;
                l2 = l2.next;
            }

            if (answer == null)
            {
                answer = new ListNode(valueToAdd);
                original = answer;
            }
            else
            {
                ListNode aNewNode = new ListNode(valueToAdd);
                answer.next = aNewNode;
                answer = answer.next;
            }
        }

        if (l1 != null)
        {
            while (l1 != null)
            {
                ListNode aNewNode = new ListNode(l1.val);
                answer.next = aNewNode;
                answer = answer.next;
                l1 = l1.next;
            }
        } else if (l2 != null)
        {
            while (l2 != null)
            {
                ListNode aNewNode = new ListNode(l2.val);
                answer.next = aNewNode;
                answer = answer.next;
                l2 = l2.next;
            }
        }
        return original;
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
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);
        l1.next.next.next = new ListNode(3);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        l2.next.next.next = new ListNode(5);

        ListNode answer = aListers.mergeTwoLists(l1, l2);


    }

}


