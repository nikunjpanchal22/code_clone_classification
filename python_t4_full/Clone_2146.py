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
    total_pairs = []
    
    for i in range(len(list1)-1):
        for j in range(i+1, len(list1)):
            if list1[i] + list1[j] == value:
                total_pairs.append(tuple(sorted((list1[i], list1[j]))))
    return total_pairs


