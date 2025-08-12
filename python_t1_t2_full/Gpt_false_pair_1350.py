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


  def myMin(mylist) :
	minimum=float('inf')
	for l in mylist :
		if isinstance(l, list) :
			minima=myMin(l)
			if minima<minimum :
				minimum=minima
		elif l<minimum :
			minimum=l 
	if minimum==float('inf'):
		return None 
	return minimum
