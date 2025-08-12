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
    stack = [the_list]
    while stack: 
        next_list = stack.pop() 
        for item in next_list:
            if isinstance(item, list):
                stack.append(item)
                indent_level += 1
            else: 
                print("\t" * indent_level, str(item))


