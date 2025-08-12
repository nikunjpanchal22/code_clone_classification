def flatten(TheList) :
	listIsNested = True
	while listIsNested :
		keepChecking = False
		Temp = []
		for element in TheList :
			if isinstance(element, list) :
				Temp.extend(element)
				keepChecking = True
			else :
				Temp.append(element)
		listIsNested = keepChecking
		TheList = Temp [:]
	return TheList




def flatten_4(TheList):
	listIsNested = True
	while listIsNested:
		temp = []
		for elem in TheList:
			if isinstance(elem, list):
				temp.extend(elem)
				listIsNested = True
			else:
				temp.append(elem)
		TheList = temp[:]
	return TheList
