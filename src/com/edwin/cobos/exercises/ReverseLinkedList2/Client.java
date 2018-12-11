package com.edwin.cobos.exercises.ReverseLinkedList2;

import com.edwin.cobos.Main;

public class Client {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == n) return head;

        ListNode prev = null;
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(0);

        int i = 0;
        ListNode p = head;
        while (p != null) {
            i++;
            if (i == m - 1) {
                prev = p;
            } else if (i == m) {
                first.next = p;
            } else if (i == n) {
                second.next = p.next;
                p.next = null;
            }

            p = p.next;
        }

        if (first.next == null)
            return head;

        // reverse list [m, n]
        ListNode p1 = first.next;
        ListNode p2 = p1.next;
        p1.next = second.next;

        while (p1 != null && p2 != null) {
            ListNode t = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = t;
        }

        //connect to previous part
        if (prev != null)
            prev.next = p1;
        else
            return p1;

        return head;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(5);




        Client c = new Client();
        ListNode r = c.reverseBetween(list, 2, 4);

        String result = "";
        ListNode tmp = r;
        while (tmp != null) {
            result += tmp.val + ", ";
            tmp = tmp.next;
        }
        System.out.println(result);
    }

}
