package ca.concordia.processmanmagement;
public class BinaryTree
{
    Node root;

    public void addNode(int key, boolean status)
    {

        Node newNode = new Node(key, status);

        if(root == null)
        {
            root = newNode;
        }else{
            Node focusNode = root;

            Node parent;

            while(true)
            {

                parent = focusNode;

                if(key < focusNode.key)
                {

                    focusNode = focusNode.leftChild;

                    if(focusNode == null)
                    {
                        parent.leftChild = newNode;
                        return;
                    }

                }else
                {

                    focusNode = focusNode.rightChild;

                    if(focusNode == null)
                    {
                        parent.rightChild = newNode;
                        return;
                    }

                }
            }
        }
    }
    public void setStatus(int key, boolean status)
    {

    }
}

