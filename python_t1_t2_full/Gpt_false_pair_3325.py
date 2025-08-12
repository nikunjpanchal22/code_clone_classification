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




def flatten2(TheList) : 
	listIsNested = True 
	while listIsNested : 
		keepChecking = False 
		Temp = [] 
		for element in TheList : 
			if type(element) == list : 
				Temp += element 
				keepChecking = True 
			else : 
				Temp.append(element)
		listIsNested = keepChecking 
		TheList = Temp [:] 
	return TheList
