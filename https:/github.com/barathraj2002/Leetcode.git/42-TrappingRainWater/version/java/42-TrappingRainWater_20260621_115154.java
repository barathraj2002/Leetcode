// Last updated: 6/21/2026, 11:51:54 AM
1class Solution {
2    public int trap(int[] height) {
3        int max_left = height[0];
4        int max_right = height[height.length-1];
5        int water_level = 0;
6
7        int i = 0;
8        int j = height.length - 1;
9
10        while(i < j){
11            int tWater = 0;
12            if (max_left <= max_right){
13                tWater = max_left - height[i];
14                if(tWater > 0){
15                    water_level+=tWater;
16                }
17                if (height[i] > max_left){
18                    max_left = height[i];
19                    continue;
20                }
21
22                i++;
23            }
24            else if (max_left > max_right){
25                tWater = max_right - height[j];
26                if(tWater > 0){
27                    water_level+=tWater;
28                }
29                if (height[j] > max_right){
30                    max_right = height[j];
31                    continue;
32                }
33                j--;
34            }
35        }
36
37        return water_level;
38    }
39}