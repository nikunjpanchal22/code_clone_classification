def almostIncreasingSequence(sequence) :
	t = 0
	for i in range(len(sequence)) :
		temp = sequence.copy()
		del temp [i]
		if temp == sorted(temp) and not (any(i == j for i, j in zip(sorted(temp), sorted(temp) [1 :]))) :
			t += 1
	return t > 0


	return i > 0




def almostIncreasingSequence(listOfNumbers) :
	tally = 0
	for x in listOfNumbers :
		temp = listOfNumbers.copy()
		temp.remove(x)


