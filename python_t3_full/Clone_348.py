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
	listIsNested = True
	while listIsNested:
		Temp = []
		for element in TheList:
			if isinstance(element, list):
				Temp += element
			else:
				Temp.append(element)
		listIsNested = any([isinstance(i, list) for i in Temp])
		TheList = Temp
	return TheList


