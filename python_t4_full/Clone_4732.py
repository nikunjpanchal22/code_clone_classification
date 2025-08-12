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
    nums.sort()
    l, r = 0, len(nums) - 1
    pairs = []
    while l < r:
        if nums[l] + nums[r] == target:
            pairs.append((nums[l], nums[r]))
            l += 1
            r -= 1
        elif nums[l] + nums[r] < target:
            l += 1
        else:
            r -= 1


