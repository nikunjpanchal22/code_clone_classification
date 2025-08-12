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


 def checkio(data) :
    duplicates = []
    visited = []
    for x in data:
        if x not in visited:
            visited.append(x)
        else:
            if x not in duplicates:
                duplicates.append(x)
    return duplicates
