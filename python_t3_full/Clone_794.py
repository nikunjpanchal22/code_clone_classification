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
	for i in range(len(sequence)): 
		ary = sequence[:i] + sequence[i+1:] 
		flag = True 
		for j in range(len(ary)-1): 
			if ary[j] >= ary[j+1]: 
				flag = False
				break 
		if flag: 
			return True 
	return False 



