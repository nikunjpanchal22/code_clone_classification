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
   for i in range(0, len(data)):
      k = i+1
      for j in range(k, len(data)):
         if data[i] == data[j] and data[i] not in duplicates:
            duplicates.append(data[i])
   return duplicates   


