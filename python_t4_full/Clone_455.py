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
    flattened = []
    for item in TheList:
        if isinstance(item, list):
            flattened.extend(flatten(item))
        else:
	        flattened.append(item)
    return flattened



