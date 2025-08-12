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


  def mssl(data_list, get_sublist = False):
    longest_length = 0
    longest_sublist = []
    for index in range(len(data_list)):
        current_length = 0
        current_sublist = []
        for j in range(index, len(data_list)):
            current_length += data_list[j]
            current_sublist.append(data_list[j])
            if current_length > longest_length:
                longest_length = current_length
                longest_sublist = current_sublist.copy()
            elif current_length < 0:
                current_length = 0
                current_sublist = []

    if get_sublist:
        return longest_sublist
    else:
        return longest_length


