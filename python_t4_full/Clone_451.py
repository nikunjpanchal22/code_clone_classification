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
    while True:
        if isinstance(TheList, list) and TheList != []:
            if (True in [isinstance(item, list) for item in TheList]):
                TheList = [item for sublist in TheList if isinstance(sublist, list) for item in sublist] + [item for item in TheList if not isinstance(item, list)]
            else:
                break
        else:
            break
    return TheList



