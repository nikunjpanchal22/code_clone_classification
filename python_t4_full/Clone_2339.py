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


 def power_function(decimal, integer): 
	if integer == 0:
		return 1
	if integer > 0:
		num = decimal 
		for f in range(1, abs(integer)):
			num *= decimal 
		return num 
	if integer < 0:
		num = 1/decimal
		for r in range(1, abs(integer)):
			num *= (1/decimal)
		return num 


