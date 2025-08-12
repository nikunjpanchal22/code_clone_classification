def sublist(a, b) :
	if not a :
		return True
	for k in range(len(b)) :
		if a [0] == b [k] :
			return sublist(a [1 :], b [k + 1 :])
	return False


 def sublist(a, b):
    if len(a) == 0: # if sublist is empty
        return True # returns true
    for i in range(len(b)): # loop for iteration
        if a[0] == b[i]: # checking if initial elements of sublist are present in original list
            return sublist(a[1:], b[i+1:]) # recursive call on remaining elements
    return False # if initial elements are not present, return false
