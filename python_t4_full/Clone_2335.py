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
		duplicates = False
		for j in range(len(temp)-1):
			if temp[j] == nums[i]:
				duplicates = True
				break
		if not duplicates:
			backtrack(res, temp, nums, i + 1)
		temp.pop()


