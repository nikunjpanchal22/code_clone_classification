def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


#gpt output=============
 def almostIncreasingSequence(sequence) :
    total = 0
    for ind in range(len(sequence)):
        tempArr = sequence.copy()
        del tempArr[ind]
        if tempArr == sorted(tempArr) and not any(x == y for x, y in zip(sorted(tempArr), sorted(tempArr)[1:])):
            total += 1


