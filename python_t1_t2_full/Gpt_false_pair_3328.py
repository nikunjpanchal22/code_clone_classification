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




def flatten_3(TheList) : 
	listIsNested = True
	while listIsNested :
		Temp = []
		for element in TheList :
			if type(element) == list :
				Temp.extend(element)
				listIsNested = True
			else :
				Temp.append(element)
		TheList = Temp [:]
	return TheList

