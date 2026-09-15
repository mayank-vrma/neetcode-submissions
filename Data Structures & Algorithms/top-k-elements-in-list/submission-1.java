class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Set<Integer> numberSet = new HashSet<Integer>();
        Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
        List<Integer> freq = new ArrayList<Integer>();

        for (int a : nums)
          numberSet.add(a);
        for (int a : numberSet)
          numberMap.put(a,0);
        for (int i=0; i<nums.length; i++){
            int temp = numberMap.get(nums[i]);
            numberMap.replace(nums[i], ++temp);
        }

        while(k>0){
            Integer maxKey = Collections.max(numberMap.entrySet(), Map.Entry.comparingByValue()).getKey();
            freq.add(maxKey);
            numberMap.remove(maxKey);
            k--;
        }

        int[] fq = new int[freq.size()];
        for (int i = 0; i < freq.size(); i++) {
          fq[i] = freq.get(i);
        }
        return fq;
    }
}
