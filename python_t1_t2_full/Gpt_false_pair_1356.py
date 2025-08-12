def myMin(mylist) :
	smallest = float('inf')
	for l in mylist :
		if isinstance(l, list) :
			tmp = myMin(l)
			if tmp < smallest :
				smallest = tmp
		elif l < smallest :
			smallest = l
	if smallest == float('inf') :
		return None
	return smallest


 def minimval(elementlist) :
	minvar = float('inf')
	for ele in elementlist :
		if isinstance(ele, list) :
			minimalvalue=minimval(ele)
			if minimalvalue<minvar :
				minvar=minimalvalue 
		elif ele<minvar :
			minvar=ele
	if minvar==float('inf') :
		return None 
	return minvar 
