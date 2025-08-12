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
    result = []
    for i in TheList:
        if isinstance(i, list):
            result.extend(flatten(i))
        else:
            result.append(i)
    return result


