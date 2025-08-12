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
   dupes = []
   seen = []
   for item in data:
        if item not in seen:
            seen.append(item)
        else:
            if item not in dupes:
                dupes.append(item)
   return dupes
