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


 def pairsum_n(list1, value) :
    set1 = set(list1)
    list1 = sorted(set1)
    solution = []
    start = 0
    end = len(list1) - 1
    while (start < end) :
        if (list1[start] + list1[end] == value) :
            solution.append((list1[start], list1[end]))
            start += 1
            end -= 1
        elif (list1[start] + list1[end] < value) :
            start += 1
        else :
            end -= 1
    
    return solution


