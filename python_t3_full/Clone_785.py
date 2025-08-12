def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


    
def almostIncreasingSequence(sequence):
    check = 0
    for n in range(len(sequence)):
        newSeq = sequence.copy()
        del newSeq[n]
        if newSeq == sorted(newSeq) and not any(z == a for z, a in zip(sorted(newSeq), sorted(newSeq)[1:])):
            check += 1


