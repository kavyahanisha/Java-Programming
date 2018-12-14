import java.util.HashMap;
import java.util.Map;

public class Solution {
  int complement;
  int[] indices= new int[2];

  public int[] twoSum(int[] nums, int target) {
    Map<Integer,Integer> numCom = new HashMap<>();
    for(int i=0;i<nums.length;i++){
      complement = target - nums[i];
      if(numCom.containsKey(complement)){

        indices[0]=numCom.get(complement);
        indices[1]= i;

        return indices;
      }

      numCom.put(nums[i],i);

    }

    return indices;
  }
}
