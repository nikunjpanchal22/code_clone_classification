def sublist(a, b) :
	if not a :
		return True
	for k in range(len(b)) :
		if a [0] == b [k] :
			return sublist(a [1 :], b [k + 1 :])
	return False


 def sublist(a, b) :
    if not a:
        return True
    for index in range(len(b)) :
        if a[0] == b[index] :
            return sublist(a[1:], b[index+1:]) 
    return False
