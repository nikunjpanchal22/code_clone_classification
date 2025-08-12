def seriesrun(x, n) :
	power = 0
	s = 0
	while power < n :
		s += (- x) ** power
		power += 1
	return s


 def seriesrun(x, n): 
    result = 0
    for i in range(0, n): 
        num = (-1)**i
        result += num * (x ** i)
    return result


