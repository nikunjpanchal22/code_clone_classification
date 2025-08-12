def is_rotation(a1, a2) :
	if len(a1) ! = len(a2) :
		return False
	double_array = a1 + a1
	return check_sublist(double_array, a2)


def is_rotation(a1, a2) :
    if len(a1) != len(a2) :
        return False
    return a2 in [a1[i:] + a1[:i] for i in range(len(a1))]



