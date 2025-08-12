def sublist(a, b) :
	if not a :
		return True
	for k in range(len(b)) :
		if a [0] == b [k] :
			return sublist(a [1 :], b [k + 1 :])
	return False


 def sublist(a, b):
	if not a: # if the sublist is empty
		return True # returns True

	for index in range(len(b)): # loop iteration
		if a[0] == b[index]: # checking if initial element from sublist is present in original list
			return sublist(a[1:], b[index+1:]) # recursive call on rest of elements
	return False # if intial elements are not present, returns false
