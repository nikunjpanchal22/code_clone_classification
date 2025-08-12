def seriesrun(x, n) :
	power = 0
	s = 0
	while power < n :
		s += (- x) ** power
		power += 1
	return s




def seriesrun(x, n): 
	power = 0
	result = 0
	while power < n:
		result += (-x) ** power
		power = power + 1
	return result
