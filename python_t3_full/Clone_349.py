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
		newList = []
		for element in TheList:
			if isinstance(element, list):
				for i in element:
					newList.append(i)
			else:
				newList.append(element)
		TheList = newList
	return TheList


