def sublistExists(list, sublist) :
	for i in range(len(list) - len(sublist) + 1) :
		if sublist == list [i : i + len(sublist)] :
			return True
	return False


#8 
def sublistExists(list, sublist):
	for i in range(len(list)-len(sublist)+1):
		if list[i]==sublist[0]:
			compare=True
			for x in range(len(sublist)):
				if list[i+x]!=sublist[x]:
					compare=False
					break
			if compare:
				return True
	return False


