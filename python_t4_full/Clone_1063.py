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


def almostIncreasingSequence(sequence): 
	retVal = True 
	for i in range(len(sequence)-1): 
		if sequence[i] >= sequence[i+1]: 
			retVal = False 
	return retVal 



