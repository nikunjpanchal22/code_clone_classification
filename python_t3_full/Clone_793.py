def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


 def almostIncreasingSequence(sequence):
    cntr = 0
    for i in range(len(sequence)):
        sub_list = sequence[:i] + sequence[i+1:]
        if sub_list == sorted(sub_list) and not any(i == j for i, j in zip(sorted(sub_list), sorted(sub_list)[1:])):
            cntr += 1
    return cntr > 0


