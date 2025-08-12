def sublist(a, b) :
	if not a :
		return True
	for k in range(len(b)) :
		if a [0] == b [k] :
			return sublist(a [1 :], b [k + 1 :])
	return False


 def check_sublist(list_a, list_b):
    if not list_a:
        return True
    for y in range(len(list_b)):
        if list_a[0] == list_b[y]:
            output1 = check_sublist(list_a[1:], list_b[y+1:])
            output2 = check_sublist(list_a, list_b[y+1:])
            return output1 or output2
    return False


