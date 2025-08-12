def deep_reverse(p) :
	if p == [] :
		return p
	if not is_list(p [0]) :
		return deep_reverse(p [1 :]) + [p [0]]
	else :
		return deep_reverse(p [1 :]) + [deep_reverse(p [0])]


def deep_reverse(p):
    r = p[::-1]
    return [deep_reverse(i) if isinstance(i, list) else i for i in r]



