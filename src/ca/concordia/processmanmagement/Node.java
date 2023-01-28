package ca.concordia.processmanmagement;

public class Node
{
    int key;
    Boolean status;
    Node leftChild;
    Node rightChild;

    Node(int key, Boolean status)
    {
        this.key = key;
        this.status = status;
    }
}
