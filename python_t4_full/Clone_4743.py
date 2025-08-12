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


 

def pairsum_n(lst, val) :
    result = []
    for i in range(len(lst)):
        for j in range(i+1, len(lst)):
            if lst[i] + lst[j] == val:
                result.append((lst[i], lst[j]))
    return result


