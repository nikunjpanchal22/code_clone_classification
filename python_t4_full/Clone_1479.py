def cumulative_sum(lst):
    new_lst = []
    for i in range(len(lst)):
        new_lst.append(sum(lst[: i + 1]))
    return new_lst


def cumulative_sum(lst):
    if len(lst) == 0:
        return []
    new_lst = cumulative_sum(lst[1:]) + [sum(lst)]
    return new_lst




