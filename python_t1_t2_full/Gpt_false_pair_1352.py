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


  def minnum(c_list) :
	smallest = float('inf')
	for lidx in c_list :
		if isinstance(lidx, list) :
			temp = minnum(lidx) 
			if temp < smallest :
				smallest = temp 
		elif lidx < smallest :
			smallest = lidx 
	if smallest == float('inf') :
		return None
	return smallest 
