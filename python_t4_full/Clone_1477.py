def cumulative_sum(lst):
    new_lst = []
    for i in range(len(lst)):
        new_lst.append(sum(lst[: i + 1]))
    return new_lst


def cumulative_sum(lst):
    new_lst = []
    temp = 0
    for item in lst:
        temp += item
        new_lst.append(temp)
    return new_lst




