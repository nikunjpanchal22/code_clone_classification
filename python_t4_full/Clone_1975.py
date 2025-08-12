def sublistExists(list, sublist) :
	for i in range(len(list) - len(sublist) + 1) :
		if sublist == list [i : i + len(sublist)] :
			return True
	return False


#1 
def sublistExists(list, sublist): 
	index=0
	for i in list: 
		if i == sublist[index]: 
			index+=1
			if index==len(sublist): 
				return True 
	return False


