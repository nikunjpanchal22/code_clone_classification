def backtrack(res, temp, nums, start) :
	res.append(temp [:])
	for i in range(start, len(nums)) :
		temp.append(nums [i])
		backtrack(res, temp, nums, i + 1)
		temp.pop()


 def backtrack(res, temp, nums, start) :
	res.append(temp)
	for i in range(start, len(nums)):
		temp1=temp[:]
		temp1.append(nums[i])
		backtrack(res, temp1, nums, i + 1)


