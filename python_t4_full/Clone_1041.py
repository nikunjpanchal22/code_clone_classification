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
    for i in range(len(sequence) - 1): 
        if sequence[i] >= sequence[i + 1]: 
            t += 1 
            if sequence[i] == sequence[i + 1]: 
                seqCopy = sequence.copy() 
                del seqCopy[i] 
                if seqCopy == sorted(seqCopy) and not(any(j - i == 1 for i, j in zip(sorted(seqCopy), sorted(seqCopy)[1:]))): 
                    t += 1
            del seqCopy[i + 1] 
            if seqCopy == sorted(seqCopy) and not(any(j - i == 1 for i, j in zip(sorted(seqCopy), sorted(seqCopy)[1:]))): 
                t += 1 
    return t > 0 


