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


  def leastvalof(el_list) :
	leastel = float('inf')
	for item in el_list :
		if isinstance(item, list) :
			minimumval=leastvalof(item)
			if minimumval<leastel :
				leastel=minimumval 
		elif item<leastel :
			leastel=item 
	if leastel==float('inf') :
		return None
	return leastel
