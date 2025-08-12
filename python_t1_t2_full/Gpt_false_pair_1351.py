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


  def min(mylist) :
	minimum=float('inf')
	for l in mylist:
		if isinstance(l, list) :
			minival=min(l)
			if minival<minimum :
				minimum=minival 
		elif l<minimum :
			minimum=l
	if minimum==float('inf') :
		return None 
	return minimum
