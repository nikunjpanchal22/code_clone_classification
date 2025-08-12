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
   i = 0
   while(i<len(data)):
      j = i + 1
      while(j<len(data)):
         if data[i] == data[j] and data[i] not in duplicates:
            duplicates.append(data[i])
         j += 1  
      i += 1


