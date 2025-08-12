def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


def almostIncreasingSequence(sequence):
    bool_res = 0
    for index in range(len(sequence)):
        sequence_copy = sequence[:]
        sequence_copy.pop(index)
        if sequence_copy == sorted(sequence_copy) and len(sequence_copy) == len(set(sequence_copy)):
            bool_res += 1
    return bool_res > 0


