package rangierbahnhof;

public class Stack<ContentType> {

    private class StackNode {

        private ContentType content = null;
        private StackNode nextNode = null;

        public StackNode(ContentType pContent) {
            content = pContent;
            nextNode = null;
        }

        public void setNext(StackNode pNext) {
            nextNode = pNext;
        }

        public StackNode getNext() {
            return nextNode;
        }

        public ContentType getContent() {
            return content;
        }

        public String toString() {
            if (content != null) {
                if (nextNode != null) {
                    return content.toString() + ":" + nextNode.toString();
                }
                return content.toString() + ":" + "[]";
            }
            return "[]";
        }
    }

    private StackNode head;

    public Stack() {
        head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void push(ContentType pContent) {
        StackNode temp = new StackNode(pContent);
        temp.setNext(head);
        head = temp;

    }

    public void pop() {
        if (head != null) {
            head = head.getNext();
        }
    }

    public ContentType top() {
        if (head != null) {
            return head.getContent();
        }
        return null;
    }

    @Override
    public String toString() {
        if (head != null) {
            return (head.toString());
        }
        return "null";
    }
}
