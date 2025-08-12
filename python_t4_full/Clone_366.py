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
   for x in range(0,len(data)):
      current_number = data[x]
      for y in data[x+1:len(data)]:
         if current_number == y:
            if y not in duplicates:
               duplicates.append(y)
   return duplicates


