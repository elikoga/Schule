package buecherregal;

public class List<ContentType> {

    public class ListNode {

        private ContentType contentObject;
        private ListNode next;

        public ListNode(ContentType pContent) {
            contentObject = pContent;
            next = null;
        }

        public ContentType getContentObject() {
            return contentObject;
        }

        public void setContentObject(ContentType pContent) {
            contentObject = pContent;
        }

        public ListNode getNextNode() {
            return this.next;
        }

        public void setNextNode(ListNode pNext) {
            this.next = pNext;
        }

    }
    ListNode first;

    ListNode last;

    ListNode current;

    public List() {
        first = null;
        last = null;
        current = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public boolean hasAccess() {
        return current != null;
    }

    public void next() {
        current = current.next;
    }

    public void toFirst() {
        current = first;
    }

    public void toLast() {
        current = last;
    }

    public ContentType getContent() {
        if (!hasAccess()) {
            return null;
        }
        return current.getContentObject();
    }

    public void setContent(ContentType pContent) {
        if (!hasAccess()) {
            return;
        }
        current.setContentObject(pContent);
    }

    public void insert(ContentType pContent) {
        current = getPrevious(current);
        append_current(pContent);
        next();
        next();
    }

    public void append_current(ContentType pContent) {
        ListNode newL = new ListNode(pContent);
        if (isEmpty()) {
            first = newL;
            current = newL;
            last = newL;
        } else {
            ListNode after = current.getNextNode();
            current.setNextNode(newL);
            newL.setNextNode(after);
        }
    }

    public void append(ContentType pContent) {
        ListNode newNode = new ListNode(pContent);
        last.setNextNode(newNode);
        last = newNode;
    }

    public void concat(List<ContentType> pList) {
        if (pList != null && !pList.isEmpty()) { // Nichts tun, wenn pList leer oder nicht existent.

            if (this.isEmpty()) { // Fall: An leere Liste anfuegen.
                this.first = pList.first;
                this.last = pList.last;
            } else { // Fall: An nicht-leere Liste anfuegen.
                this.last.setNextNode(pList.first);
                this.last = pList.last;
            }

            // Liste pList loeschen.
            pList.first = null;
            pList.last = null;
            pList.current = null;
        }
    }

    public void remove() {

    }

    private ListNode getPrevious(ListNode pNode) {
        if (pNode != first && !this.isEmpty()) {
            ListNode temp = first;
            while (temp != null && temp.getNextNode() != pNode) {
                temp = temp.getNextNode();
            }
            return temp;
        } else {
            return null;
        }
    }

}
