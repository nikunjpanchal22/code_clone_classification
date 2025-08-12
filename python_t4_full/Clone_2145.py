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
    list1 = sorted(list(set(list1)))
    pairs = []
    start_index, end_index = 0, len(list1)-1 
    while (start_index < end_index):        
        if (list1[start_index] + list1[end_index] == value):
            pairs.append((list1[start_index],list1[end_index]))
            start_index += 1
        elif (list1[start_index] + list1[end_index] < value):
            start_index += 1
        else:
            end_index -= 1
    return pairs


