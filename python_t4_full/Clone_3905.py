def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0




def almostIncreasingSequence(sequence) :
	cond = 0
	for i in range(len(sequence)) :
		se = sequence[:]
		se.pop(i)
		if se == sorted(se) and len(set(se)) == len(se) :
			cond += 1


