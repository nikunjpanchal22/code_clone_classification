def is_rotation(a1, a2) :
	if len(a1) ! = len(a2) :
		return False
	double_array = a1 + a1
	return check_sublist(double_array, a2)





import collections
def is_rotation(a1, a2):
    d = collections.deque(a1)
    if len(d) != len(a2):
        return False
    d.extend(a1)
    return list(d) == a1+a1


