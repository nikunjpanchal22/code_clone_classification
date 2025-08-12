def awesome(my_string) :
	if is_substr(my_string, ["A", "B", "C"]) :
		x = do_something() + complicated_thing()
	elif is_substr(my_string, ["1", "2", "3"]) :
		x = do_something_else() + complicated_thing()
	elif is_substr(my_string, ["!", "#", "$"]) :
		x = do_another_thing() + complicated_thing()
	return x + ("Hello" if some_condition(x) else "World")


def awesome(my_string):
    funcs = [('ABC', do_something), ('123', do_something_else), ('!#$', do_another_thing)]
    for chars, func in funcs:
        if any(c in my_string for c in chars):
            x = func() + complicated_thing()
            break
    return x + ("Hello" if some_condition(x) else "World")



