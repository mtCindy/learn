public class LinkListTest {

    public static void main(String[] args) {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);

        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

//        printNode(head);

        Node preHead = reverse(head);
        printNode(preHead);

    }

    public static void printNode(Node head) {
        if (head == null) {
            return;
        }

        Node curNode = head;
        while (curNode != null) {
            System.out.println("++++++++++++++"+curNode.getValue());
            curNode = curNode.getNext();
        }
    }

    public static Node reverse(Node head) {
        if (head == null) {
            return head;
        }

        Node pre = head;
        Node cur = head.getNext();


        while (cur != null) {
            Node temp = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = temp;
        }
        head.setNext(null);
        return pre;
    }
}
