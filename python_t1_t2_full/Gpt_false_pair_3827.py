def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0




def almostIncreasingSequence(sequence) :
	amount = 0
	for i in range(len(sequence)) :
		copy = sequence.copy()
		del copy [i]
		if copy == sorted(copy) and not (any(i == j for i, j in zip(sorted(copy), sorted(copy) [1 :]))) :
			amount += 1
	return amount > 0
