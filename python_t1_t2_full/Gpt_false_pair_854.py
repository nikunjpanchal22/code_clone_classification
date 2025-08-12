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


  def mssl(nums, return_sublist = False):
    max_length = 0
    longest_sublist = []

    for i in range(0, len(nums)):
        sublist = [nums[i]]
        SUM = nums[i]
        for j in range(i + 1, len(nums)):
            SUM += nums[j]
            sublist.append(nums[j])
            if SUM > max_length:
                max_length = SUM
                longest_sublist = sublist.copy()
            elif SUM < 0:
                SUM = 0
                sublist = []
    if return_sublist:
        return longest_sublist
    else:
        return max_length
