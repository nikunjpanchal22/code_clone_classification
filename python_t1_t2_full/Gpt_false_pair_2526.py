def deep_reverse(p) :
	if p == [] :
		return p
	if not is_list(p [0]) :
		return deep_reverse(p [1 :]) + [p [0]]
	else :
		return deep_reverse(p [1 :]) + [deep_reverse(p [0])]




def deep_reverse(param):
    if param == []:
        return param
    if not is_list(param[0]):
        return deep_reverse(param[1:]) + [param[0]]
    else:
        return deep_reverse(param[1:]) + [deep_reverse(param[0])]

