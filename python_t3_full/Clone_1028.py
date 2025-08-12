def cumulative_sum(lst):
    new_lst = []
    for i in range(len(lst)):
        new_lst.append(sum(lst[: i + 1]))
    return new_lst


def cumulative_sum(lst):
    new_lst = []
    accumulator = 0
    for i in range(len(lst)):
        accumulator += lst[i]
        new_lst.append(accumulator)
    return new_lst




