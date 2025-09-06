package problems.leetcode;

public class leet_code_2_Add_Two_Numbers {
    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public void solve() {
        int[] array1 = new int[]{0,0,0,0,0,0,1};
        int[] array2 = new int[]{9,9,9,9};

        ListNode l1 = new ListNode(array1[0]);
        ListNode currentNode = l1;

        for (int i = 1; i < array1.length; i++) {
            currentNode.next = new ListNode(array1[i]);
            currentNode = currentNode.next;
        }

        ListNode l2 = new ListNode(array2[0]);
        currentNode = l2;

        for (int i = 1; i < array2.length; i++) {
            currentNode.next = new ListNode(array2[i]);
            currentNode = currentNode.next;
        }

        ListNode result = this.addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode currentNode = l3;
        ListNode currentL1 = l1;
        ListNode currentL2 = l2;
        while (currentL1 != null || currentL2 != null) {
            if (currentL1 != null) {
                currentNode.val += currentL1.val;
                currentL1 = currentL1.next;
            }

            if (currentL2 != null) {
                currentNode.val += currentL2.val;
                currentL2 = currentL2.next;
            }


            if (currentNode.val >= 10) {
                ListNode node = new ListNode(1);
                currentNode.val = currentNode.val % 10;
                currentNode.next = node;
                currentNode = node;
            }else if(currentL1 != null || currentL2 != null) {
                ListNode node = new ListNode();
                currentNode.next = node;
                currentNode = node;
            }
        }

        return l3;
    }
}
