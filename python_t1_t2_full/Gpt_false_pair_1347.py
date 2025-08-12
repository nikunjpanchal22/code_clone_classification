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


  def minimumvar(l_list) :
	min_element=float('inf')
	for item in l_list :
		if isinstance(item, list) :
			min_value=minimumvar(item)
			if min_value<min_element :
				min_element=min_value 
		elif item<min_element :
			min_element=item 
	if min_element==float('inf') :
		return None 
	return min_element 
