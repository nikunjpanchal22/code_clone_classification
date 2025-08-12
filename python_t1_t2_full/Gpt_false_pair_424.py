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
    isList = True
    while isList:
        temp = [] 
        for element in TheList:
            if isinstance(element, list):
                temp.extend(element)
                isList = True
            else :
                temp.append(element) 
                isList = False
        TheList = temp[:]
    return TheList
