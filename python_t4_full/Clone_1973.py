def sublistExists(list, sublist) :
	for i in range(len(list) - len(sublist) + 1) :
		if sublist == list [i : i + len(sublist)] :
			return True
	return False


#7 
def sublistExists(list, sublist):
	if not len(sublist):
		return True
	if not len(list):
		return False		
	if sublist[0] in list:
		return sublistExists(list[list.index(sublist[0])+1:], sublist[1:])
	else:
		return False


