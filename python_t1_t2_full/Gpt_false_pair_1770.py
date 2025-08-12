def sumvars(x, y, z, d = None) :
	s = x
	if not d is None :
		d ['first_step'] = s
	s += y
	if not d is None :
		d ['second_step'] = s
	s += z
	return s


  def sumvars(x, y, z, d = None): 
	total_up = x
	if d is not None: 
		d["first_step"] = total_up 
	total_up += y
	if d is not None: 
		d["second_step"] = total_up 
	total_up += z
	return total_up
