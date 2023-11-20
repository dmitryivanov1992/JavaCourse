package Day18.Task3;

public class Task3 {
    public static void main(String[] args) {
        Node root = new Node(20);
        insertNewNode(root,14);
        insertNewNode(root,11);
        insertNewNode(root,5);
        insertNewNode(root,8);
        insertNewNode(root,16);
        insertNewNode(root,15);
        insertNewNode(root,18);
        insertNewNode(root,23);
        insertNewNode(root,22);
        insertNewNode(root,27);
        insertNewNode(root,24);
        insertNewNode(root,150);

        dfs(root);

    }

    public static void insertNewNode(Node root, int value) {
        if (value >= root.getValue()) {
            if (root.getRightSon() == null) {
                root.setRightSon(new Node(value));
            } else {
                Node nextNode = root.getRightSon();
                insertNewNode(nextNode, value);
            }
        } else {
            if (root.getLeftSon() == null) {
                root.setLeftSon(new Node(value));
            } else {
                Node nextNode = root.getLeftSon();
                insertNewNode(nextNode, value);
            }
        }
    }

    public static void dfs(Node root){
        if (root!=null){
            dfs(root.getLeftSon());
            System.out.print(root.getValue()+" ");
            dfs(root.getRightSon());
        }
    }
}

