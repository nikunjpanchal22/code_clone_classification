def sublistExists(list, sublist) :
	for i in range(len(list) - len(sublist) + 1) :
		if sublist == list [i : i + len(sublist)] :
			return True
	return False


#6 
def sublistExists(list, sublist): 
	startIndex = 0 
	for i in range(len(list)-len(sublist)+1): 
		for j in range(len(sublist)): 
			if list[i+j] != sublist[j]: 
				startIndex = i + j + 1 
				break 
		if startIndex == 0: 
			return True 
	return False 


