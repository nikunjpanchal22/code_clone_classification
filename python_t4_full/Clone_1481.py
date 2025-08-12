def cumulative_sum(lst):
    new_lst = []
    for i in range(len(lst)):
        new_lst.append(sum(lst[: i + 1]))
    return new_lst


def cumulative_sum(lst):
    new_lst = list(np.cumsum(lst))
    return new_lst


# 8. Using Itertools:
import itertools



