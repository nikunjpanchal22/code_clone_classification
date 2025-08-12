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
	computation = x
	if d is not None: 
		d["first_step"] = computation 
	computation += y
	if d is not None: 
		d["second_step"] = computation 
	computation += z
	return computation
