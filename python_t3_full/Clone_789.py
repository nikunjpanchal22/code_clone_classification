def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0



 def almostIncreasingSequence(sequence):
    totalIncreasing = 0
    for r in range(len(sequence)):
        cloneSequence = sequence.copy()
        del cloneSequence[r]
        if cloneSequence == sorted(cloneSequence) and not any(c == d for c, d in zip(sorted(cloneSequence), sorted(cloneSequence)[1:])):
            totalIncreasing += 1


