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
    for x in range(len(list1)-1):
        for y in range(x+1, len(list1)):
            if list1[x]+list1[y] == value:
                pairs.append((list1[x],list1[y]))
    return pairs


