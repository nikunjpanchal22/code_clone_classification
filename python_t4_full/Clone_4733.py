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



def pairsum_n(nums, target):
    counter = Counter(nums)
    res = []

    for num in counter:
        if counter[num] > 0 and counter[target - num] > 0:
            res.append((num, target - num))
            counter[num] -= 1
            counter[target - num] -= 1
    return res



