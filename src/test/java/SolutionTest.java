import org.example.ListNode;
import org.example.Solution;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionTest {

    Solution solution;
    ListNode listNode;
    ListNode result;
    ListNode next;

    @BeforeAll
    void setup(){
        solution = new Solution();
    }
    @Test
    public void middleOfOneNumber(){
        listNode = new ListNode(4);
        result = new ListNode(4);

        assertEquals(result.getVal(), solution.middleNode(listNode).getVal());
    }

    @Test
    public void middleOfTwoNumber(){
        next = new ListNode(3);
        listNode = new ListNode(4,next);
        result = new ListNode(3);

        assertEquals(result.getVal(), solution.middleNode(listNode).getVal());
    }

    @Test
    public void middleOfFiveNumber(){
        next = new ListNode(345);
        listNode = new ListNode(12,next);
        result = new ListNode(345);

        assertEquals(result.getVal(), solution.middleNode(listNode).getVal());
    }

    @Test
    public void middleOfSixNumber(){
        next = new ListNode(456);
        listNode = new ListNode(123,next);
        result = new ListNode(456);

        assertEquals(result.getVal(), solution.middleNode(listNode).getVal());
    }
}
