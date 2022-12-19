package utils;

import java.io.PrintStream;

public class Coordinater {
    final class Node {
        Node(Cords value){
            this.value = value;
            left = null;
            right = null;
        }
        Cords value;
        Node left;
        Node right;

        public Cords getValue() {
            return value;
        }

        public Node getLeft() {
            return left;
        }

        public Node getRight() {
            return right;
        }
    }

    public Node root;

    public void add(Cords value){
        root = addRecursive(root, value);
    }

    private Node addRecursive(Node current, Cords newValue){
        if(current == null){
            return new Node(newValue);
        }
        if(newValue.getLength() < current.value.getLength()){
            current.left = addRecursive(current.left, newValue);
        } else if(newValue.getLength() > current.value.getLength()){
            current.right = addRecursive(current.right, newValue);
        } else {
            return current;
        }
        return current;
    }

    private String traversePreOrder(Node root) {

        if (root == null) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(root.getValue());

        String pointerRight = "└──";
        String pointerLeft = (root.getRight() != null) ? "├──" : "└──";

        traverseNodes(sb, "", pointerLeft, root.getLeft(), root.getRight() != null);
        traverseNodes(sb, "", pointerRight, root.getRight(), false);

        return sb.toString();
    }

    private void traverseNodes(StringBuilder sb, String padding, String pointer, Node node,
                              boolean hasRightSibling) {
        if (node != null) {
            sb.append("\n");
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.getValue());

            StringBuilder paddingBuilder = new StringBuilder(padding);
            if (hasRightSibling) {
                paddingBuilder.append("│  ");
            } else {
                paddingBuilder.append("   ");
            }

            String paddingForBoth = paddingBuilder.toString();
            String pointerRight = "└──";
            String pointerLeft = (node.getRight() != null) ? "├──" : "└──";

            traverseNodes(sb, paddingForBoth, pointerLeft, node.getLeft(), node.getRight() != null);
            traverseNodes(sb, paddingForBoth, pointerRight, node.getRight(), false);
        }
    }

    public void print(PrintStream os) {
        os.print(traversePreOrder(root));
    }
}
