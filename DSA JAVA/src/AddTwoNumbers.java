import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = addTwoNumbers(l1, l2);


        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode l3 = new ListNode(0);
        ListNode current = l3;
        int carry = 0;

        while (l1 != null && l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int value = x + y + carry;
            carry = value / 10;
            current.next = new ListNode(value % 10);
            current = current.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        while (l1 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int value = x + carry;
            carry = value / 10;
            current.next = new ListNode(value % 10);
            current = current.next;
            if (l1 != null) l1 = l1.next;
        }

        while (l2 != null) {
            int y = (l2 != null) ? l2.val : 0;
            int value = y + carry;
            carry = value / 10;
            current.next = new ListNode(value % 10);
            current = current.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return l3.next;
    }
}
class ListNode{
    int val;

    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
