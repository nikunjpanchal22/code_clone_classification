def sublistExists(list, sublist) :
	for i in range(len(list) - len(sublist) + 1) :
		if sublist == list [i : i + len(sublist)] :
			return True
	return False


#5 
def sublistExists(list, sublist):
	found = False
	for l in list:
		if l == sublist[0]:
			found = True
			for i in range(1,len(sublist)):
				if list[list.index(l)+i] != sublist[i]:
					found = False
		if found == True:
			return True
	return False


