def is_rotation(a1, a2) :
	if len(a1) ! = len(a2) :
		return False
	double_array = a1 + a1
	return check_sublist(double_array, a2)




def is_rotation_4(list_one, list_two):
	if len(list_one) != len(list_two): 
		return False
	double_list = list_one + list_one
	return check_sublist(double_list, list_two)
