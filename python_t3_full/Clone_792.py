def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


    
def almostIncreasingSequence(sequence):
    amount = 0
    for q in range(len(sequence)):
        dSequence = sequence.copy()
        del dSequence[q]
        if dSequence == sorted(dSequence) and not any(h == i for h, i in zip(sorted(dSequence), sorted(dSequence)[1:])):
            amount += 1


