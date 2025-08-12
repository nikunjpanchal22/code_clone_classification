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
	foo = [{'subs' : ['A', 'B', 'C'], 'func' : do_operation},
	{'subs' : ['1', '2', '3'], 'func' : do_another_operation},
	{'subs' : ['!', '?', '.'], 'func' : do_some_more_operation}]
	for bar in foo :
		if any(s in string for s in bar ['subs']) :
			x = bar ['func'](x)
			break
	x += complex_process()
	if some_condition(x) :
		x += "Hello"
	else :
		x += "World"
	return x

