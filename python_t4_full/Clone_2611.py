def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b) : 
    index = 0 
    for element_a in a: 
        inside_list = False 
        for element_b in b[index:]: 
            if element_a == element_b: 
                inside_list = True 
                index = b.index(element_b)
                break
        if not inside_list: 
            return False 
    return True


