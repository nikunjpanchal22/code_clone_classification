def deep_reverse(p) :
	if p == [] :
		return p
	if not is_list(p [0]) :
		return deep_reverse(p [1 :]) + [p [0]]
	else :
		return deep_reverse(p [1 :]) + [deep_reverse(p [0])]



 def deep_reverse(p) :
    if p == []:
		return p
	if not is_list(p [0]) :
		i = 0
		rev_list = []
		while i < len(p) :
			rev_list.insert (0, p[i])
			i += 1
		return rev_list
	else :
		i = 0
		rev_list = []
		while i < len(p) :
			if is_list(p[i]) :
				rev_list.insert (0, deep_reverse(p[i]))
			else :
				rev_list.insert (0, p[i])
			i += 1


