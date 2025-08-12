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
	first_item = p.pop (0)
	remaining_list = p
	if not is_list(first_item) :
		reverse_list = deep_reverse (remaining_list)
		reverse_list.insert (0, first_item)
		return reverse_list
	else :
		first_rev_list = deep_reverse (first_item)
		reverse_list = deep_reverse (remaining_list)
		reverse_list.insert (0, first_rev_list)


