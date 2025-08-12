def awesome(string) :
	foo = [{'subs' : ['A', 'B', 'C'], 'func' : do_something},
	{'subs' : ['1', '2', '3'], 'func' : do_something_else},
	{'subs' : ['!', '?', '.'], 'func' : do_another_thing}]
	for bar in foo :
		if any(s in string for s in bar ['subs']) :
			x = bar ['func']()
			break
	x += complicated_thing()
	if some_condition(x) :
		x += "Hello"
	else :
		x += "World"
	return x


 def awesome(string) :
	foo = [['A', 'B', 'C', do_something], 
		   ['1', '2', '3', do_something_else],
	       ['!', '?', '.', do_another_thing]]
	for sub, func in foo :
		if string in sub :
			x = func()
			break
	x *= complicated_thing() 
	if any(c.isdigit() for c in string):
		x += "Hello"
	else :
		x += "World"
	return x


