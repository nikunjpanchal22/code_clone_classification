def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


 def almostIncreasingSequence(sequence):
    ctr = 0
    for i in range(len(sequence) - 1):
        sublist = sequence[:i] + sequence[i+1:]
        if sublist == sorted(sublist) and not any(i == j for i, j in zip(sorted(sublist), sorted(sublist)[1:])):
            ctr += 1
    return ctr > 0


