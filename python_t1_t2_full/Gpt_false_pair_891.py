def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


 def almostIncreasingSequence(sequence):
    nums = 0
    for x in range(len(sequence)):
        tempLis = sequence.copy()
        del tempLis[x]
        if tempLis == sorted(tempLis) and not (any(i == j for i, j in zip(sorted(tempLis), sorted(tempLis)[1:]))):
            nums += 1
    return nums > 0
