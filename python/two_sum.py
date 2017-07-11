#!/usr/bin/env python3
import unittest

class Solution(object):

    def two_sum(self, nums, target):
        """
        A solution to https://leetcode.com/problems/two-sum

        Given an array of integers, return two unique indicies of two numbers
        that add up to the supplied target.

        The same element may not be used twice.

        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """

        for i, a in enumerate(nums):
            for j, b in enumerate(nums):
                if i == j:
                    continue
                if a + b == target:
                    return [i, j]

        return None

class TestSolution(unittest.TestCase):
    def test_simple(self):
        s = Solution()
        self.assertEqual([0, 2], s.two_sum([1, 2, 3, 4], 4))

    def test_no_reuse(self):
        s = Solution()
        self.assertEqual([1, 2], s.two_sum([3, 2, 4], 6))

if __name__ == '__main__':
    unittest.main()

        
