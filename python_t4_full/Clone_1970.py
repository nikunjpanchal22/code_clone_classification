def sublistExists(list, sublist) :
	for i in range(len(list) - len(sublist) + 1) :
		if sublist == list [i : i + len(sublist)] :
			return True
	return False


#3 
def sublistExists(list, sublist): 
	if len(sublist)>len(list): 
		return False 
	for i in range(len(list)-len(sublist)+1): 
		check=True 
		for j in range(len(sublist)): 
			if list[i+j] != sublist[j]: 
				check=False 
		if check: 
			return True 
	return False


