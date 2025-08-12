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
    result = []
    hashmap ={}
    for i, num in enumerate(nums):
        diff = target - num
        if  diff in hashmap:
            result.append((diff, num))
        hashmap[num] = i


