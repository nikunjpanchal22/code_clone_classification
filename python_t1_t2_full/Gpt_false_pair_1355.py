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


  def smallestval(mylist) :
	smallele=float('inf')
	for l in mylist:
		if isinstance(l, list) :
			smaller_el=smallestval(l)
			if smaller_el<smallele :
				smallele=smaller_el 
		elif l<smallele :
			smallele=l 
	if smallele==float('inf') :
		return None 
	return smallele 
