def almostIncreasingSequence(sequence) :
	for i, x in enumerate(sequence) :
		ret = False
		s = sequence [: i] + sequence [i + 1 :]
		for j, y in enumerate(s [1 :]) :
			if s [j + 1] < = s [j] :
				ret = True
				break
			if ret :
				break
		if not ret :
			return True
	return False


def almostIncreasingSequence(sequence) :
	for i in range(len(sequence)-1) :
		firstHalf = sequence[:i]
		secondHalf = sequence[i+1:]
		if all(firstHalf[j] < firstHalf[j+1] and secondHalf[j] < secondHalf[j+1] for j in range(len(firstHalf)-1)):
			return True
	return False 



