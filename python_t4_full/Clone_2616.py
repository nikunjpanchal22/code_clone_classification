def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b) :
    if any(elem in a for elem in b): # checks if any elements are shared between a and b
        return True
    else:
        return False


