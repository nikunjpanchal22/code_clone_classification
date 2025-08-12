def sublistExists(list, sublist) :
	for i in range(len(list) - len(sublist) + 1) :
		if sublist == list [i : i + len(sublist)] :
			return True
	return False




def sublistExists(list1, list2) : 
	for i in range(len(list1) - len(list2) + 1) : 
		if list2 == list1[i : i + len(list2)] : 
			return True 
	return False
