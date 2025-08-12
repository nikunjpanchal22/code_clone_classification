def sublist(a, b) :
	last = 0
	for el_a in a :
		if el_a in b [last :] :
			last = b [last :].index(el_a)
		else :
			return False
	return True


 def sublist(a, b):
    for i in range(len(a)): # For each element of the sublist
        if a[i] in b: # Check if the element is there
            continue
        else: # Return False if it's not 
            return False
    return True # Returns Statment if each elements of the sublist is in the main list


