def sublistExists(list, sublist) :
	for i in range(len(list) - len(sublist) + 1) :
		if sublist == list [i : i + len(sublist)] :
			return True
	return False


#4 
def sublistExists(list, sublist): 
   	for i in range(len(list)-len(sublist)+1): 
		if all(list[i + j] == sublist[j] for j in range(len(sublist))): 
			return True 
	return False 
