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


def pairsum_n(lst, target):
    return [pair for pair in combinations(lst, 2) if sum(pair) == target]


 

def pairsum_n(arr, sum):
    s = set()
    result = []
    for i in range(0,len(arr)):
        temp = sum-arr[i]


