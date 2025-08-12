def is_rotation(a1, a2) :
	if len(a1) ! = len(a2) :
		return False
	double_array = a1 + a1
	return check_sublist(double_array, a2)




def is_rotation_3(num1, num2) : 
	if len(num1) != len(num2) :
		return False
	
	double_array = num1 * 2
	return check_sublist(double_array, num2)
	
