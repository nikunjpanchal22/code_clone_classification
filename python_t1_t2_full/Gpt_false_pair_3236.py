def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True




def sublist(arrayA, arrayB): 
    last_idx = 0
    for element_A in arrayA: 
        if element_A in arrayB[last_idx:]: 
            last_idx = arrayB.index(element_A, last_idx) 
        else: 
            return False 
    return True
