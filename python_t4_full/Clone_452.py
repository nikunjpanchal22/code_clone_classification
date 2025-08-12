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
	output_list = []
	for item in TheList: 
		if isinstance(item, list): 
			output_list.extend(flatten(item)) 
		else: 
			output_list.append(item) 
	return output_list



