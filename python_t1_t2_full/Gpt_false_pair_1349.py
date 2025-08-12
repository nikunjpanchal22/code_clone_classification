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


 def theleast(itemlist) :
	lowermost = float('inf')
	for el in itemlist :
		if isinstance(el, list) :
			leastofall=theleast(el)
			if leastofall<lowermost :
				lowermost=leastofall 
		elif el<lowermost :
			lowermost=el
	if lowermost==float('inf') :
		return None 
	return lowermost 
