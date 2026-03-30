# Linked List Cycle (LeetCode 141)

> This document presents my solution to the classic algorithmic problem "Linked List Cycle", created as part of my learning journey in data structures and algorithms (DSA).

## Problem Description

Given the head (`head`) of a linked list, the goal is to determine whether the list contains a cycle.
A cycle exists if a node in the list can be reached again by continuously following the `next` pointer. The algorithm must return `true` if a cycle is present, and `false` otherwise.

## Approach: Floyd's Algorithm (Tortoise and Hare)

The most optimized solution relies on Floyd's cycle detection algorithm, which uses the two-pointer technique:

1. **Slow pointer (`slow`):** Moves one node at a time.
2. **Fast pointer (`fast`):** Moves two nodes at a time.

**Logic:** If the list does not contain a cycle, the fast pointer will reach the end of the list (`null`).
However, if a cycle exists, the fast pointer will inevitably "lap" and catch up with the slow pointer. The moment both pointers meet (`slow == fast`) mathematically confirms the presence of a loop.

## Complexity

* **Time complexity:** $O(N)$
  Where $N$ is the number of nodes in the linked list. In the worst case (no cycle or a cycle near the very end), the entire list is traversed proportionally to its size.
* **Space complexity:** $O(1)$
  The additional memory used is strict and constant. Only two pointers (`slow` and `fast`) are allocated, regardless of the size of the linked list.
