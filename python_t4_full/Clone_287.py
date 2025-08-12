def seriesrun(x, n) :
	power = 0
	s = 0
	while power < n :
		s += (- x) ** power
		power += 1
	return s


 def seriesrun(x, n):
    x_to_power = x
    result = 0

    for i in range(n): 
        result += (x_to_power) ** (-i)
        x_to_power *=x 

    return result


