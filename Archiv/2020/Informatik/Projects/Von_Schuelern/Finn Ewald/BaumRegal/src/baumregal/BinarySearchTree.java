package baumregal;

public class BinarySearchTree<ContentType extends ComparableContent<ContentType>> {

    private class BSTNode<CT extends ComparableContent<CT>> {

        private CT content;
        private BinarySearchTree<CT> left, right;

        public BSTNode(CT pContent) {

            this.content = pContent;
            left = new BinarySearchTree<>();
            right = new BinarySearchTree<>();
        }

    }

    /* ----------- Ende der privaten inneren Klasse -------------- */
    private BSTNode<ContentType> node;

    /**
     * Der Konstruktor erzeugt einen leeren Suchbaum.
     */
    public BinarySearchTree() {
        this.node = null;
    }

    public boolean isEmpty() {
        return this.node == null;
    }

    public void insert(ContentType pContent) {
        if (pContent != null) {
            if (node.content == null) {
                node.content = pContent;
            } else {
                if (node.content.isGreater(pContent)) {
                    node.left.insert(pContent);
                } else {
                    node.right.insert(pContent);
                }
            }
        }
    }

    public BinarySearchTree<ContentType> getLeftTree() {
        if (!isEmpty()) {
            return node.left;
        } else {
            return null;
        }
    }

    public ContentType getContent() {
        if (node.content != null) {
            return node.content;
        } else {
            return null;
        }
    }

    public BinarySearchTree<ContentType> getRightTree() {
        if (!isEmpty()) {
            return node.right;
        } else {
            return null;
        }
    }

    public void remove(ContentType pContent) {

    }

    public ContentType search(ContentType pContent) {
        if (!(isEmpty() || pContent == null)) {
            if (node.content == pContent) {
                return node.content;
            }
            if (node.left == null && node.right == null) {
                return null;
            }
            if (node.left != null && node.content.isGreater(pContent)) {
                return node.left.search(pContent);
            } else {
                if (node.right != null && node.content.isLess(pContent)) {
                    return node.right.search(pContent);
                }
            }
        }
        return null;
    }

}
