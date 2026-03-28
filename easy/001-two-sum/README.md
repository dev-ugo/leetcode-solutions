# Two Sum (LeetCode 1) 

> This exercise was completed as part of my learning of data structures and algorithms, with a focus on using `HashMap` in Java.

## Problem Statement

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

## Approach 

The approach I chose to solve this problem is to use a `HashMap` to store the array elements (as keys) and their indices (as values). 

The trick is to do this in a **single pass** (One-Pass). For each number, we calculate its complement (the difference between the target and the current number) and check if it already exists in our HashMap.

* **Time Complexity:** O(n) - We traverse the array containing *n* elements only once. Searching in a HashMap takes constant time O(1).
* **Space Complexity:** O(n) - In the worst-case scenario, we will have to store almost all elements of the array in the HashMap before finding the valid pair.

## Execution Example

For `nums = [2, 7, 11, 15]` and `target = 9`:
1. Index `0` (Value `2`): The required complement is `9 - 2 = 7`. `7` is not in the Map. We add `(key: 2, value: 0)`.
2. Index `1` (Value `7`): The required complement is `9 - 7 = 2`. `2` is present in the Map at index `0`.
3. We return the indices `[0, 1]`.

## Code (Java)

```java
import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (numbers.containsKey(complement)) {
                return new int[] { numbers.get(complement), i };
            }
            
            numbers.put(nums[i], i);
        }
        
        return new int[] {};
    }
}