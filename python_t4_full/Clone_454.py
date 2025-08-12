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
    stack = []
    for item in TheList:
        if isinstance(item, list):
           stack.extend(item)
        else:
            stack.append(item)
    return flatten(stack) if stack else TheList



