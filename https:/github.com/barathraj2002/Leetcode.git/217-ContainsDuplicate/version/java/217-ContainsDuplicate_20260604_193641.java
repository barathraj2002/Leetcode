// Last updated: 6/4/2026, 7:36:41 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Set<Integer> set = new HashSet<>();
4        for (int i : nums){
5            set.add(i);
6        }
7
8        return set.size() != nums.length;
9    }
10}