def seriesrun(x, n) :
	power = 0
	s = 0
	while power < n :
		s += (- x) ** power
		power += 1
	return s


 def seriesRun(x, n):
    result = 0
    if x == 0: 
        return 0
    count = 0
    power = 0
    while count < n: 
        result += pow((-x), power)/(pow(x, power))
        power += 1
        count +=1
    return result


