
// Simplified Logic for UC8
public boolean isPalindrome(Node head) {
    if (head == null || head.next == null) return true;

    Node slow = head, fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }


    Node prev = null, curr = slow;
    while (curr != null) {
        Node nextTemp = curr.next;
        curr.next = prev;
        prev = curr;
        curr = nextTemp;
    }


    Node firstHalf = head, secondHalf = prev;
    while (secondHalf != null) {
        if (firstHalf.data != secondHalf.data) return false;
        firstHalf = firstHalf.next;
        secondHalf = secondHalf.next;
    }
    return true;
}