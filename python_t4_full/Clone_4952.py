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
    if integer == 0: return 1
    temp = power_function(decimal, integer // 2)
    if integer%2 == 0: return temp * temp
    else: return decimal * temp * temp if integer > 0 else (temp * temp) / decimal


