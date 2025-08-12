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
		rev_rem = p [1 : ]
		rev_rem.reverse ()
		rev_rem.append (p [0])
		return rev_rem
	else :
		rev_rem = p [1 : ]
		rev_first = deep_reverse (p [0])
		rev_rem.reverse ()
		rev_rem.append (rev_first)


