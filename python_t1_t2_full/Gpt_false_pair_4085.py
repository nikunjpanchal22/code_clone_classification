def is_rotation(a1, a2) :
	if len(a1) ! = len(a2) :
		return False
	double_array = a1 + a1
	return check_sublist(double_array, a2)




def is_rotation(arr1, arr2):
	if len(arr1) != len(arr2):
		return False
	double_array = arr2 + arr2
	return check_subsequence(double_array, arr1)
