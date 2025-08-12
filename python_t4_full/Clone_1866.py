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
			print ("\t" * indent_level, item)


 def print_list(the_list, indent_level=0):
    if not the_list:
        pass
    else:
        if isinstance(the_list[0], list):
            print_list(the_list[0], indent_level + 1)
            print_list(the_list[1:], indent_level)
        else:
            print("\t" * indent_level, the_list[0])
            print_list(the_list[1:], indent_level)


