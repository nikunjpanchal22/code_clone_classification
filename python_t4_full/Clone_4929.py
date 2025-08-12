def sumvars(x, y, z, d = None) :
	s = x
	if not d is None :
		d ['first_step'] = s
	s += y
	if not d is None :
		d ['second_step'] = s
	s += z
	return s





def sumvars(p, q, r, mapping = None):
    s = p
    if mapping != None:
        mapping ['first_step'] = s
    s = s + q
    if mapping != None:
        mapping ['second_step'] = s
    s = s + r


