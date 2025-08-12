def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b) :
	result = False 
	for i in range(0, len(b)): # loop through b
		temp = b[i:]
		if set(a) <= set(temp): # check if elements from a is included in the temporary list created 
			result = True 
			break
	return result


