def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0




def almostIncreasingSequence(sequence) :
	t = 0
	for idx in range(len(sequence)) :
		tmp = sequence.copy()
		del tmp [idx]
		if tmp == sorted(tmp) and not (any(i == j for i, j in zip(sorted(tmp), sorted(tmp) [1 :]))) :
			t += 1
	return t > 0

