# Contains Duplicate (LeetCode 217)

> This exercise was completed as part of my learning of data structures and algorithms, with a focus on using `HashSet` in Java.

## Problem Statement

Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

## Approach 

The approach I chose to solve this problem is to use a `HashSet` to keep track of the numbers seen so far. A `HashSet` only stores unique elements. 

As we iterate through the array, we attempt to add each number to the `HashSet`. In Java, the `add()` method of a Set returns `false` if the element is already present. If this happens, it means we have found a duplicate, and we can immediately return `true`. If the loop finishes without finding any duplicates, we return `false`.

* **Time Complexity:** O(n) - We traverse the array containing *n* elements at most once. The `add()` operation in a HashSet takes O(1) time on average.
* **Space Complexity:** O(n) - In the worst-case scenario (an array with all distinct elements), we will store all *n* elements in the HashSet.

## Execution Example

For `nums = [1, 2, 3, 1]`:
1. `num = 1`: Added to the HashSet. Set currently contains: `{1}`.
2. `num = 2`: Added to the HashSet. Set currently contains: `{1, 2}`.
3. `num = 3`: Added to the HashSet. Set currently contains: `{1, 2, 3}`.
4. `num = 1`: We try to add `1`. The HashSet already contains it, so `add()` returns `false`. We immediately return `true`.

## Code (Java)

```java
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();

        for (int num : nums) {
            // If the addition fails, the number is already in the set (duplicate found)
            if (!numbers.add(num)) {
                return true;
            }
        }

        return false;
    }
}