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
	while any(isinstance(item, list) for item in TheList):
		tempList = []
		for item in TheList:
			if isinstance(item, list):
				for subitem in item:
					tempList.append(subitem)
			else:
				tempList.append(item)
		TheList = tempList
	return TheList


