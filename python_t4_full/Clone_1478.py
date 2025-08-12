def cumulative_sum(lst):
    new_lst = []
    for i in range(len(lst)):
        new_lst.append(sum(lst[: i + 1]))
    return new_lst


def cumulative_sum(lst):
    for i in range(len(lst)):
        if i == 0:
            new_lst = [lst[0]]
        else:
            new_lst.append(lst[i] + new_lst[i - 1])
    return new_lst




