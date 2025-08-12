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
   n = len(the_list)
   i = 0
   while i<n:
       if isinstance(the_list[i], list):
           indent_level += 1
           print_list(the_list[i], indent_level)
       else:
           print("\t" * indent_level, str(the_list[i]))
       i+=1


