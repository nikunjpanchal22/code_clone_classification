def print_list(the_list, indent_level = 0) :
	stack = [iter(the_list)]
	while stack :
		try :
			item = stack [- 1].next()
		except StopIteration :
			stack.pop()
			indent_level -= 1
			continue
		if isinstance(item, list) :
			indent_level += 1
			stack.append(iter(item))
		else :
			print "\t" * indent_level, item






def print_list(the_list, indent_level = 0) :
    i = iter(the_list)
    for item in i :
        if isinstance(item, list) :
            print_list(item, indent_level + 1)


