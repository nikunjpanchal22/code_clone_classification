def deep_reverse(p) :
	if p == [] :
		return p
	if not is_list(p [0]) :
		return deep_reverse(p [1 :]) + [p [0]]
	else :
		return deep_reverse(p [1 :]) + [deep_reverse(p [0])]



 def deep_reverse(p) :
    if p == [] :
		return p
	if not is_list(p [0]) :
		rem = p [1 :]
		reversed_list = deep_reverse (rem)
		reversed_list.append (p [0])
		reversed_list.reverse ()
		return reversed_list
	else :
		rem = p [1:]
		rev_last = deep_reverse (p [0])
		rev_rem = deep_reverse (rem)
		rev_rem.append (rev_last)
		rev_rem.reverse ()


