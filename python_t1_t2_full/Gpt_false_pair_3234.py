def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True




def sublist(list1, list2): 
    last_index = 0
    for elem_list1 in list1: 
        if elem_list1 in list2[last_index:]: 
            last_index = list2.index(elem_list1, last_index) 
        else: 
            return False 
    return True 

