def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0




def almostIncreasingSequence(sequence) :
	totalCount = 0
	for i in range(len(sequence)) :
		clone = sequence.copy()
		del clone [i]
		if clone == sorted(clone) and not (any(i == j for i, j in zip(sorted(clone), sorted(clone) [1 :]))) :
			totalCount += 1
	return totalCount > 0
