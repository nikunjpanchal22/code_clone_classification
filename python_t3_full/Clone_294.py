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
   new_list = []
   searched = []
   for element in data:
      if element not in searched and element in data[data.index(element)+1:]:
         new_list.append(element)
         searched.append(element)
   return new_list


