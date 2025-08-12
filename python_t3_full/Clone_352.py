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


 def flatten(TheList):
	newList = []
	for item in TheList:
		if isinstance(item, list):
			for sublist in item:
				newList.append(sublist)
		else:
			newList.append(item)
	TheList = newList
	return TheList


