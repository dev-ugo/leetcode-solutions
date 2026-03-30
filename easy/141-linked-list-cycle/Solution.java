public class Solution {

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode head = solution.new ListNode(1);
        ListNode node2 = solution.new ListNode(2);
        head.next = node2;
        node2.next = head;
        System.out.println(solution.hasCycle(head));
    }
}