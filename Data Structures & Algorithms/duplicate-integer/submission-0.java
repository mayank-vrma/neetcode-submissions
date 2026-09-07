class Solution {
    public boolean hasDuplicate(int[] nums) {
        int org_len = nums.length;
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if(org_len == set.size())
          return false;
        else
          return true;
    }
}