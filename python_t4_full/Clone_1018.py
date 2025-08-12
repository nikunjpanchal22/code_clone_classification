def mssl(lst, return_sublist = False) :
    longest_length = 0
    longest_sublist = []
    for i in range(0, len(lst)) :
        sublist = [lst[i]]
        SUM = lst[i]
        for j in range(i+1, len(lst)):
            SUM += lst[j]
            sublist.append(lst[j])
            if SUM > longest_length :
                longest_length = SUM
                longest_sublist = sublist
    if return_sublist :
        return longest_sublist
    else :
        return longest_length


  def mssl(list_of_values, return_sublist = False):
    current_length, longest_length = 0, 0
    longest_sublist, current_sublist = 0, []

    for value in list_of_values:
        current_length += value
        current_sublist.append(value)

        if current_length > longest_length:
            longest_length, longest_sublist = current_length, current_sublist.copy()
        elif current_length < 0:
            current_length, current_sublist = 0, []

    return longest_sublist if return_sublist else longest_length



