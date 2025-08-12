def deep_reverse(p) :
	if p == [] :
		return p
	if not is_list(p [0]) :
		return deep_reverse(p [1 :]) + [p [0]]
	else :
		return deep_reverse(p [1 :]) + [deep_reverse(p [0])]




def deep_reverse_type3(p):
	if not p:
		return p
	if not is_list(p[0]):
		return deep_reverse_type3(p[1:]) + [p[0]]
	else:
		return deep_reverse_type3(p[1:]) + [deep_reverse_type3(p[0])]

