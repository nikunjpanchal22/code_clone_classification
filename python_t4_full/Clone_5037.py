def awesome(my_string) :
	if is_substr(my_string, ["A", "B", "C"]) :
		x = do_something() + complicated_thing()
	elif is_substr(my_string, ["1", "2", "3"]) :
		x = do_something_else() + complicated_thing()
	elif is_substr(my_string, ["!", "#", "$"]) :
		x = do_another_thing() + complicated_thing()
	return x + ("Hello" if some_condition(x) else "World")




def awesome(my_string):
    x = ''
    for i in ['A', 'B', 'C']:
        if i in my_string: 
            x = do_something() + complicated_thing()
            break
    if not x:
        for i in ['1', '2', '3']:
            if i in my_string:
                x = do_something_else() + complicated_thing()
                break
    if not x:
        for i in ['!', '#', '$']:
            if i in my_string:
                x = do_another_thing() + complicated_thing()
    return x + ("Hello" if some_condition(x) else "World")


