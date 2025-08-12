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


  def minimfun(mylist) :
	small = float('inf')
	for el in mylist :
		if isinstance(el, list) :
			leastel=minimfun(el)
			if leastel<small :
				small=leastel
		elif el<small :
			small=el 
	if small==float('inf') :
		return None 
	return small
