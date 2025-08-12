def sumvars(x, y, z, d = None) :
	s = x
	if not d is None :
		d ['first_step'] = s
	s += y
	if not d is None :
		d ['second_step'] = s
	s += z
	return s


    var_sum += variable3
    return var_sum




def sumvars(var1, var2, var3, dict_var = None) :
    s = var1
    if dict_var is not None :
        dict_var ['first_step'] = s
    s += var2


