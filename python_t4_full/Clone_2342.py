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
	result = 1
	if integer > 0:
		for i in range(integer):
			result *= decimal 
		return result
	else: 
		for i in range(abs(integer)):
			result /= decimal
		return result


