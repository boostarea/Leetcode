# Leetcode

#### 1. 三向拆分快速排序

[75. Sort Colors（荷兰国旗问题）](<https://leetcode.com/problems/sort-colors/>)

给定一个数组，仅包含0,1,2，需排序后转换为：0在1前，1在2前。

```shell
Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
```

```java
class Solution {
    public void sortColors(int[] nums) {
        int zero=-1, one=0, two=nums.length;
        for (;one<two;) {
            if (nums[one] == 0) {
                swap(nums, ++zero, one++);
            } else if (nums[one] == 2) {
                swap(nums, one, --two);
            } else {
                ++one;
            }
        }
    }
    
    private void swap(int[] nums, int older, int newer) {
        int temp = nums[older];
        nums[older] = nums[newer];
        nums[newer] = temp;
    }
}
```

