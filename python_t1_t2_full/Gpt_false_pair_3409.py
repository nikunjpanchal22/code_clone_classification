def checkio(data) :
	elements = []
	duplicates = []
	for i in data :
		if i not in elements :
			elements.append(i)
		else :
			if i not in duplicates :
				duplicates.append(i)
	return duplicates




def checkio(data): 
	elements = [] 
	duplicates = [] 
	for i in data: 
		if i in elements:
			if i not in duplicates: 
				duplicates.append(i) 
		else: 
			elements.append(i)
	return duplicates
