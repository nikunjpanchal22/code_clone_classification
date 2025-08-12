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
    res = []
    stack = [TheList]
    while stack:
        words = stack.pop()
        for word in words:
            if isinstance(word, list):
                stack.append(word)
            else:
                res.append(word)
    return res



