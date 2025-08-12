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
	sum = x
	if d is not None: 
		d["first_step"] = sum 
	sum += y
	if d is not None: 
		d["second_step"] = sum 
	sum += z
	return sum
