def cumulative_sum(lst):
    new_lst = []
    for i in range(len(lst)):
        new_lst.append(sum(lst[: i + 1]))
    return new_lst


def cumulative_sum(lst):
    newlst = [sum(lst[: i + 1]) for i in range(len(lst))]
    return newlst


# 3. Using Reduce and Lambda Functions:
from functools import reduce



