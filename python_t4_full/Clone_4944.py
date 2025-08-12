def backtrack(res, temp, nums, start) :
	res.append(temp [:])
	for i in range(start, len(nums)) :
		temp.append(nums [i])
		backtrack(res, temp, nums, i + 1)
		temp.pop()


 

def backtrack(res, temp, nums, start):
    res.append(temp[:])
    for bridge, num in enumerate(nums[start:], start):
        temp.append(num)


