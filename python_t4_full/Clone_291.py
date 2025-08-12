def seriesrun(x, n) :
	power = 0
	s = 0
	while power < n :
		s += (- x) ** power
		power += 1
	return s


 def seriesrun(x, n):
    result = 0
    for i in range(1, n):
        result += (-1)**(n-i)*(x**i)
    return result


