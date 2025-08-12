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
    if TheList == []:
        return TheList
    if isinstance(TheList[0], list):
        return flatten(TheList[0]) + flatten(TheList[1:])
    return TheList[:1] + flatten(TheList[1:])





