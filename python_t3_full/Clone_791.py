def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0



 def almostIncreasingSequence(sequence) :
    analysis = 0
    for i in range(len(sequence)):
        copy_sequence = sequence.copy()
        del copy_sequence[i]
        if copy_sequence == sorted(copy_sequence) and not any(a == b for a, b in zip(sorted(copy_sequence), sorted(copy_sequence)[1:])):
            analysis += 1


