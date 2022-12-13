package utils;

public class Coordinater {
    class Node {
        Node(Cords data){
            this.data = data;
            left = null;
            right = null;
        }
        Cords data;
        Node left;
        Node right;
    }

    Node root;

    Coordinater(Cords data){
        root = new Node(data);
    }

    private Node addRecursive(Node current, Cords newCord){
        if(current == null){
            return new Node(newCord);
        }

        if(newCord.getDistanceFrom(root.data) < newCord.getDistanceFrom(current.data))

    }
}
