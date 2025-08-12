def seriesrun(x, n) :
	power = 0
	s = 0
	while power < n :
		s += (- x) ** power
		power += 1
	return s


 def seriesRun(x, n): 
    result = 0
    power = 0
    while power < n:
        base = - x
        result = result + base ** power
        power += 1
    return result


