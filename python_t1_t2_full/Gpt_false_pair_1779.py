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
	calculation = x
	if d is not None: 
		d["first_step"] = calculation 
	calculation += y
	if d is not None: 
		d["second_step"] = calculation 
	calculation += z
	return calculation
