def power_function(decimal, integer) :
	num = 1
	for function in range(abs(integer)) :
		if integer > 0 :
			num *= decimal
		if integer < 0 :
			num *= 1.0 / decimal
		if integer == 0 :
			num = 1
	return num


 def power_function(decimal, integer) :
	if integer == 0 :
		return 1
	else :
		if integer > 0 :
			return decimal**integer
		if integer < 0 :
			return 1 / (decimal**abs(integer))


