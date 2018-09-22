package Lists;

import java.util.List;

public class SortedLists
{

    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        ListNode answer = new ListNode(0);
        ListNode current = l1;
        ListNode previous = l1;


        while (current != null)
        {
            previous = current;
            int l1Value = current.val;
            int l2Value = l2.val;

            ListNode l2Link = l2.next;

            if (l1Value >= l2Value)
            {
                ListNode aNewValue = new ListNode(l2Value);
                aNewValue.next = current;
                l2 = l2.next;
                current = current.next;
            }
            else
            {
                ListNode l2NextNode = current.next;
                ListNode aNewValue = new ListNode(l2Value);
                current.next = aNewValue;
                aNewValue.next = l2NextNode;
                current = current.next;
                l2 = l2.next;

                int currentValue = current.val;
                if (current.next != null)
                {
                    int nextCurrentValue = current.next.val;

                    while (current != null && currentValue == nextCurrentValue)
                    {
                        current = current.next;
                        if (current != null)
                        {
                            currentValue = current.val;
                        }
                        else
                        {
                            break;
                        }
                        if (current.next != null)
                        {
                            nextCurrentValue = current.next.val;
                        }
                    }

                }

            }

        }

        while (l2 != null)
        {
            ListNode newNode = new ListNode(l2.val);
            previous.next = newNode;
            previous = previous.next;
            l2 = l2.next;
        }

        return l1;
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

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode answer = aListers.mergeTwoLists(l1, l2);


    }

}


