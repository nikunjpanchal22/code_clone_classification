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
	set1 = set(list1)
	list1 = list(set1)
	pair_list = []
	for num_1 in list1:
		for num_2 in list1:
			if num_1 + num_2 == value and (num_1, num_2) not in pair_list and num_1 != num_2:
				pair_list.append(tuple(sorted((num_1, num_2))))
	return pair_list


