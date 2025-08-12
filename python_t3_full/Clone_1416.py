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


 def pairsum_n(list1, value):
	set1 = set(list1)
	list1 = list(set1)
	total_pairs = []

	for num in list1:
		sum_value = value - num
		if sum_value in list1:
			total_pairs.append((num, sum_value))

	return total_pairs



