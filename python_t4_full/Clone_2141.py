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
    distinct_list = list(dict.fromkeys(list1))
    left, right = 0, len(distinct_list)-1
    
    while (left < right):
        curr_sum = distinct_list[left] + distinct_list[right]
        if (curr_sum == value):
            pairs.add((distinct_list[left], distinct_list[right]))
            left += 1
            right -= 1
        elif (curr_sum > value):
            right -= 1
        else:
            left += 1
            
    return list(pairs)


