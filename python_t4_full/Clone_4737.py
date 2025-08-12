def pairsum_n(list1, value) :
	set1 = set(list1)
	list1 = sorted(set1)
	solution = []
	maxi = value / 2
	for i in list1 :
		if i > = maxi :
			break
		j = value - i
		if j in set1 :
			solution.append((i, j))
	return solution



def pairsum_n(list1, value):
    set1 = set(list1)
    return list(filter(lambda x: x[1] in set1 and x[0] <= value/2, [(i, value-i) for i in sorted(set1)]))



