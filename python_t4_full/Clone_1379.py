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
		remaining_list = p [1 : ]
		reverse_list = []
		for item in reversed (remaining_list) :
			reverse_list.append (item)
		reverse_list.append (p [0])
		return reverse_list
	else :
		first_item = p [0]
		remaining_list = p [1 : ]
		first_rev_list = deep_reverse(first_item)
		reverse_list = deep_reverse(remaining_list)
		reverse_list.append (first_rev_list)


