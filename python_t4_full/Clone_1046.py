def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


 def almostIncreasingSequence(sequence): 
    count = 0 
    for i in range(1, len(sequence)): 
        if sequence[i - 1] >= sequence[i]: 
            count += 1 
            if sequence[i] == sequence[i + 1]: 
                seqCopy = sequence.copy() 
                del seqCopy[i]
                if seqCopy == sorted(seqCopy):
                    count += 1 
            del seqCopy[i + 1] 
            if seqCopy == sorted(seqCopy) and not(any(i == j for i, j in zip(sorted(seqCopy), sorted(seqCopy)[1:]))):
                count += 1
    return True if count <= 1 else False 


