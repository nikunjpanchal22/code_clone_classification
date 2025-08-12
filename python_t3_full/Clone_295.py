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
   for element in data:
      if data.count(element) > 1:
         if element not in new_list:
            new_list.append(element)
   return new_list


