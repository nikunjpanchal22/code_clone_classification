def second_largest(numbers) :
	count = 0
	m1 = m2 = float('-inf')
	for x in numbers :
		count += 1
		if x > m2 :
			if x > = m1 :
				m1, m2 = x, m1
			else :
				m2 = x
	return m2 if count > = 2 else None




def second_largest(nums):
	count = 0
	largest, sec_largest = float('-inf'), float('-inf')
	for n in nums:
		count += 1
		if n > sec_largest:
			if n >= largest:
				largest, sec_largest = n, largest
			else:
				sec_largest = n
	return sec_largest if count >= 2 else None
