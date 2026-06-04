# Last updated: 6/4/2026, 7:47:43 PM
1class Solution:
2    def containsDuplicate(self, nums: List[int]) -> bool:
3        a = set()
4        for i in range(len(nums)):
5            if a.__contains__(nums[i]):
6                return True
7            else:
8                a.add(nums[i])
9        return False