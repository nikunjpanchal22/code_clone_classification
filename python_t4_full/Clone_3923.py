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


 

def almostIncreasingSequence(s):
    for i in range(len(s)):
        p = s[:i] + s[i+1:]
        if all(x<y for x, y in zip(p, p[1:])): 
            return True
    return False


