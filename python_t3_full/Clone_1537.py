def backtrack(res, temp, nums, start) :
	res.append(temp [:])
	for i in range(start, len(nums)) :
		temp.append(nums [i])
		backtrack(res, temp, nums, i + 1)
		temp.pop()


 def backtrack(res, temp, nums, start):
	res.append(temp[:])
	for i in range(start, len(nums)):
		if nums[i] not in temp and nums[i] not in res:
			temp.append(nums[i])
			backtrack(res, temp, nums, i+1)
			temp.pop(-1)


