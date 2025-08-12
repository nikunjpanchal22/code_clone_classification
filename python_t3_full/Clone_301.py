def is_rotation(a1, a2) :
	if len(a1) != len(a2) :
		return False
	double_array = a1 + a1
	return check_sublist(double_array, a2)


 def is_rotation(list_a, list_b): 
    if len(list_a) != len(list_b):
        return False 
    check = [True for word in list_a if word in list_b]
    return len(list_b) == len(check)


