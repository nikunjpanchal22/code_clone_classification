def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


 def almostIncreasingSequence(sequence):
   countNum = 0
   for ind in range(len(sequence)):
       tempSeq = sequence.copy()
       del tempSeq[ind]
       if tempSeq == sorted(tempSeq) and not (any(i == j for i, j in zip(sorted(tempSeq), sorted(tempSeq)[1:]))):
           countNum += 1
   return countNum > 0
