import org.junit.Assert;
import org.junit.Test;

public class testTwoSum {

  Solution ts = new Solution();

  @Test
  public void testSum(){
    int[] expected = new int[2];
    expected[0] =0;
    expected[1] = 1;

    int[] nums = new int[] {2,3,4,5,6};



    Assert.assertEquals(expected[0],ts.twoSum(nums,5)[0]);

    Assert.assertEquals(expected[1],ts.twoSum(nums,5)[1]);

  }


}
