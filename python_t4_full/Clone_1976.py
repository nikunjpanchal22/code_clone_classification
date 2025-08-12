def sublistExists(list, sublist) :
	for i in range(len(list) - len(sublist) + 1) :
		if sublist == list [i : i + len(sublist)] :
			return True
	return False


#9 
def sublistExists(list, sublist) :
	iter = (list[i:i+len(sublist)] for i in range(len(list)-len(sublist)+1))
	for sl in iter :
		if sl == sublist :
			return True
	return False


