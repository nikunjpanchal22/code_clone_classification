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
   temp_list = the_list[:]
   while(temp_list):
       if isinstance(temp_list[0], list):
           temp_list = temp_list[0]+temp_list[1:]
           indent_level += 1
       else:
           print("\t" * indent_level, temp_list.pop(0))


