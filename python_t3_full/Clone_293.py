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
   dups = []
   for x in data:
        for y in data[data.index(x)+1:]:
            if x == y:
                if x not in dups:
                    dups.append(x)
   return dups


