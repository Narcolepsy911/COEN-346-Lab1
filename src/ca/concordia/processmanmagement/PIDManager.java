package ca.concordia.processmanmagement;
import java.util.BitSet;
public class PIDManager
{
    static final int MIN_PID = 300;
    static final int MAX_PID = 500;

    void allocateMap() throws Exception
    {
        BinaryTree binaryTree = new BinaryTree();

        for(int i = 0; i < (MAX_PID-MIN_PID); i++)
        {
            binaryTree.addNode(MIN_PID+i, true);
        }
    }

    int allocatePid() throws Exception
    {
        return 0;
    }

    void releasePid(int pid)
    {

    }
}

