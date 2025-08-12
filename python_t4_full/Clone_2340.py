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
		total = decimal
		for i in range(1, integer):
			total *= decimal
		return total
	else:
		total = 1 / decimal
		for i in range(-1, integer, -1):
			total *= 1/decimal
		return total


