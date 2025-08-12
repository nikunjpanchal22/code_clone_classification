def is_rotation(a1, a2) :
	if len(a1) ! = len(a2) :
		return False
	double_array = a1 + a1
	return check_sublist(double_array, a2)




def is_rotation_3(array_one, array_two):
	if len(array_one) != len(array_two): 
		return False
	double_array = array_one + array_one
	return check_sublist(double_array, array_two)

