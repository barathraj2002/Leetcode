# Last updated: 6/4/2026, 7:49:32 PM
class Solution:
    def containsDuplicate(self, l: List[int]) -> bool:
       d1=len(l)
       d2=len(set(l))
       if(d1==d2):
           return False
       else:
        return True
        