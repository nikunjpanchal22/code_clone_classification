def pairsum_n(list1, value) :
	set1 = set(list1)
	list1 = sorted(set1)
	solution = []
	maxi = value / 2
	for i in list1 :
		if i >= maxi :
			break
		j = value - i
		if j in set1 :
			solution.append((i, j))
	return solution


  def pairsum_n(list1, value) :
	set1 = set(list1)
	list1 = sorted(set1)
	solution = []
	left, right = 0, len(list1) - 1
	while left < right:
		if list1[left] + list1[right] == value:
			if list1[left] != list1[right]:
				solution.append((list1[left], list1[right]))
			left += 1
			right -= 1
		elif list1[left] + list1[right] > value:
			right -= 1
		elif list1[left] + list1[right] < value:
			left += 1
	return solution


