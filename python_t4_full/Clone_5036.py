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


	if in_beat(move):
		move += "Hello"
	else:
		move += "World"
	return move


 


def awesome(string):
	foo = [{'subs': ['W', 'X', 'Y'], 'func': say_this},
	{'subs': ['120', '130', '140'], 'func': say_that},
	{'subs': ['\\', '/', ','], 'func': say_something_else}]
	for bar in foo:
		if any(s in string for s in bar['subs']):
			words = bar['func']()


