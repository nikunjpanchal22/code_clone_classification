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
   dup_list = []
   for i in range(len(data)):
      for j in range(i+1,len(data)):
         if data[i] == data[j] and data[i] not in dup_list:
            dup_list.append(data[i])
   return dup_list 


