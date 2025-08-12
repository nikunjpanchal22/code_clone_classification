def backtrack(res, temp, nums, start) :
	res.append(temp [:])
	for i in range(start, len(nums)) :
		temp.append(nums [i])
		backtrack(res, temp, nums, i + 1)
		temp.pop()


 def backtrack(res, temp, nums, start) :
	res.append(temp[:])
	for i in range(start, len(nums)):
		temp.append(nums[i])
		if nums[i] not in res:
			backtrack(res, temp[1:], nums, i + 1)
		temp.pop()


