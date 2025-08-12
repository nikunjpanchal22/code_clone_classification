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
		rev_rem = deep_reverse (p [1:])
		rev_rem.append (p [0])
		rev_final = []
		for item in reversed (rev_rem) :
			rev_final.append (item)
		return rev_final
	else :
		rev_first = deep_reverse (p [0])
		rev_rem = deep_reverse (p [1:])
		rev_rem.append (rev_first)
		rev_final = []
		for item in reversed (rev_rem) :
			rev_final.append (item)


