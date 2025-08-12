def sumvars(x, y, z, d = None) :
	s = x
	if not d is None :
		d ['first_step'] = s
	s += y
	if not d is None :
		d ['second_step'] = s
	s += z
	return s




def sumvars(a, b, c, diction=None):
    s = a
    if diction: diction['first_step'] = s
    s += b
    if diction: diction['second_step'] = s
    s += c
    return s


