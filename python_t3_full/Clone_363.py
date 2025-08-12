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
    for item in TheList:
        if isinstance(item, list):
            sublists = flatten(item)
            for i in sublists:
                result.append(i)
        else:
            result.append(item)    
    return result



