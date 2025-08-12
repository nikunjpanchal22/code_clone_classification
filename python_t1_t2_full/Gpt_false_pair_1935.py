def sublist(a, b) :
	if not a :
		return True
	for k in range(len(b)) :
		if a [0] == b [k] :
			return sublist(a [1 :], b [k + 1 :])
	return False


 def subs(list_a, list_b):
    if not list_a:
        return True
    for i in range(len(list_b)):
        if list_a[0] == list_b[i]:
            return subs(list_a[1:], list_b[i+1:]) or subs(list_a, list_b[i+1:])
    return False
