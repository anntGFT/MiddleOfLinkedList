package org.example;

public class Solution {

    public Solution(){

    }

    public ListNode middleNode(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode first = head;
        ListNode second = head;

        while (second != null && second.next != null) {
            first = first.next;
            second = second.next.next;
        }
        return first;
    }
}
