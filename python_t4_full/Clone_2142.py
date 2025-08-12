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
    pairs = set()
    sorted_list1 = sorted(list1)
    left_index = 0
    right_index = len(sorted_list1)-1
    while (left_index < right_index):
        if sorted_list1[left_index] + sorted_list1[right_index] == value:
            pairs.add(tuple(sorted((sorted_list1[left_index], sorted_list1[right_index]))))
            left_index += 1
            right_index -= 1
        elif sorted_list1[left_index] + sorted_list1[right_index] > value:
            right_index -= 1
        elif sorted_list1[left_index] + sorted_list1[right_index] < value:
            left_index += 1
    return list(pairs)


