def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


			tally += 1
	return tally > 0




def almostIncreasingSequence(n) :
	result = 0
	for x in range(len(n)) :
		subSeq = list(n)


