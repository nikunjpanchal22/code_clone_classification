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
    list1 = sorted(set1)
    solution = [] 

    i, j = 0, len(list1) - 1
    
    while i < j:
        if list1[i] + list1[j] == value:
            solution.append((list1[i], list1[j]))
            i += 1
            j -= 1
        elif list1[i] + list1[j] > value:
            j -= 1
        else:
            i += 1
    
    return solution


