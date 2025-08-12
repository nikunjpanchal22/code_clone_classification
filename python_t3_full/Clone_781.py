def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


 def almostIncreasingSequence(sequence): 
    t = 0 
    temp_sequence = sequence.copy() 
    for i in range (len(sequence)): 
        del temp_sequence[i] 
        if len(list(set(temp_sequence))) == len(temp_sequence) and temp_sequence == sorted(temp_sequence): 
            t += 1 
    return t > 0


