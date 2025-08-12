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
	foo = {'A' : do_something, 'B' : do_something_else, 'C' : do_another_thing}
	if string in foo :
		x = foo[string]()
	else : 
		x = 0
	x += complicated_thing()
	if isinstance(x, str) :
		x += "Hello"
	else :
		x += "World"
	return x


