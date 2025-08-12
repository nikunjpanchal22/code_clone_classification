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
	res = x
	if d is not None: 
		d["first_step"] = res 
	res += y
	if d is not None: 
		d["second_step"] = res 
	res += z
	return res
