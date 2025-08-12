def pairsum_n(list1, value) :
	set1 = set(list1)
	list1 = sorted(set1)
	solution = []
	maxi = value / 2
	for i in list1 :
		if i >= maxi :
			break
		j = value - i
		if j in set1 :
			solution.append((i, j))
	return solution


 def pairsum_n(list1,value):
    unique_list = list(set(list1))
    pairs = []
    left = 0
    right = len(unique_list)-1
    while (left < right):
        if (unique_list[left] + unique_list[right] == value):
            pairs.append((unique_list[left],unique_list[right]))
            left += 1
        elif (unique_list[left] + unique_list[right] > value):
            right -= 1
        else:
            left += 1

    return pairs


