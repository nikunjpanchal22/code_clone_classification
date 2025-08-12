def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


def almostIncreasingSequence(sequence):
    sequence = [[sequence[:i]+sequence[i+1:]] for i in range(len(sequence))]
    return any([sequence[i] == sorted(sequence[i]) and len(sequence[i]) == len(set(sequence[i])) for i in range(len(sequence))])



