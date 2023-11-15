package Day18.Task3;

public class Node {
    private Node leftSon;
    private Node RightSon;
    private final int value;
    public Node(int value){
        this.value = value;
    }

    public void setLeftSon(Node leftSon) {
        this.leftSon = leftSon;
    }
    public void setRightSon(Node RightSon){
        this.RightSon = RightSon;
    }

    public Node getLeftSon() {
        return leftSon;
    }

    public Node getRightSon() {
        return RightSon;
    }

    public int getValue() {
        return value;
    }
}
