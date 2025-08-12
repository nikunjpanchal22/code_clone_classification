def seriesrun(x, n) :
	power = 0
	s = 0
	while power < n :
		s += (- x) ** power
		power += 1
	return s


 def seriesRun(x, n): 
    result = 0
    p = 1 
    for i in range(1, n+1): 
        result += (p * ((-1)*x)**(i-1))
        p *= -1
    return result


