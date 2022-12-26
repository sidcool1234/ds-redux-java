package org.leetcode;

// https://leetcode.com/problems/add-two-numbers/description/

/**
 *  Notes:
 *  Iterate over the two lists carefully since they may be of different sizes.
 *  In the while condition, also cehck for the carryForward number since even if all the lists have been
 *      exhausted, the last number has to be considered.
 *  In each iteration , check for null for both
 */
public class AddTwoNumbersAsLinkedLists {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(1);

        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(3);


        System.out.println("Inputs ==> l1=" + l1.toString() + ", l2=" + l2.toString());
        System.out.println("Output ==> " + add(l1, l2).toString());

    }

    public static ListNode add(final ListNode l1, final ListNode l2) {
        if (l1 == null || l2 == null) throw new IllegalArgumentException("Null inputs");

        ListNode lA = l1;
        ListNode lB = l2;

        int rem = 0;
        int cf = 0;
        ListNode outputListNode = null;
        ListNode head = null;

        while (lA != null || lB != null || cf > 0) {
            int sum = 0;
            if (lA != null) {
                sum += lA.val;
                lA = lA.next;
            }

            if (lB != null) {
                sum += lB.val;
                lB = lB.next;
            }
            sum += cf;

            rem = sum % 10;
            cf = sum / 10;

            if (outputListNode == null) {
                outputListNode = new ListNode(rem);
                head = outputListNode;
            } else {
                outputListNode.next = new ListNode(rem);
                outputListNode = outputListNode.next;
            }
        }
        return head;
    }


    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode lTemp = this;
            while (lTemp != null) {
                sb.append(lTemp.val).append("-->");
                lTemp = lTemp.next;
            }

            return sb.toString();
        }
    }

}


