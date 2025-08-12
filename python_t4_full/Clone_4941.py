def backtrack(res, temp, nums, start) :
	res.append(temp [:])
	for i in range(start, len(nums)) :
		temp.append(nums [i])
		backtrack(res, temp, nums, i + 1)
		temp.pop()


def backtrack(res, temp, nums, start):
    res.append(temp.copy())
    for bridge in range(start, len(nums)):
        temp += (nums[bridge],)
        backtrack(res, temp, nums, bridge + 1)
        temp = temp[:-1]



