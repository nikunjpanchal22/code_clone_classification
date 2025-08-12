def sumvars(x, y, z, d = None) :
	s = x
	if not d is None :
		d ['first_step'] = s
	s += y
	if not d is None :
		d ['second_step'] = s
	s += z
	return s



  


def sumvars(a1, a2, a3, diction = None):
    sum_a = a1
    if diction:
       diction['first_step'] = sum_a 
    sum_a = sum_a + a2
    if diction:
       diction['second_step'] = sum_a


