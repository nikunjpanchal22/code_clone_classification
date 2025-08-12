def cumulative_sum(lst):
    new_lst = []
    for i in range(len(lst)):
        new_lst.append(sum(lst[: i + 1]))
    return new_lst


def cumulative_sum(lst):
    new_lst = []
    accumulator = 0
    i = 0
    while i < len(lst):
        accumulator += lst[i]
        new_lst.append(accumulator)
        i += 1
    return new_lst


# 7. Using Numpy's Functions:
import numpy as np



