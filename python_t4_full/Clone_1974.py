def sublistExists(list, sublist) :
	for i in range(len(list) - len(sublist) + 1) :
		if sublist == list [i : i + len(sublist)] :
			return True
	return False


#10 
def sublistExists(list, sublist) :
	if list == sublist:
		return True 
	if len(list) < len(sublist):
		return False 

	for i in range(len(list) - len(sublist) + 1):
		if list[i] == sublist[0]:
			if list[i: i + len(sublist)] == sublist:
				return True 



