def deep_reverse(p) :
	if p == [] :
		return p
	if not is_list(p [0]) :
		return deep_reverse(p [1 :]) + [p [0]]
	else :
		return deep_reverse(p [1 :]) + [deep_reverse(p [0])]


 def deep_reverse(p):
    if p == []:
        return p
    if type(p[0]) is list:
        return deep_reverse(p[1:]) + [deep_reverse(p[0][::-1])]
    else:
        return deep_reverse(p[1:]) + [p[-1]]


