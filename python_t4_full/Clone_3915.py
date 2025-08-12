def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0





def almostIncreasingSequence(s) :
	v = 0
	for x in range(len(s)) :
		new_s = list(s)
		new_s.pop(x)
		if new_s == sorted(new_s) and len(new_s) == len(set(new_s)) :
			v += 1


