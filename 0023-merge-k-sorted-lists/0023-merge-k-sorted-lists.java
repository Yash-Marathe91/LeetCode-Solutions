class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));

        for (ListNode root : lists) {
            if (root != null) {
                minHeap.add(root);
            }
        }     
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while (!minHeap.isEmpty()) {
            ListNode smallestNode = minHeap.poll();
            current.next = smallestNode;
            current = current.next;
            
            if (smallestNode.next != null) {
                minHeap.add(smallestNode.next);
            }
        }    
        return dummy.next;
    }
}