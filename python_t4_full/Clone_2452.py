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
	if string in foo.keys() :
		x = foo[string]()
	x = complicated_thing() // x
	if 'e' in string or 'E' in string:
		x += "Hello"
	else :
		x += "World"
	return x


