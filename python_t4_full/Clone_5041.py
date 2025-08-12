def awesome(my_string) :
	if is_substr(my_string, ["A", "B", "C"]) :
		x = do_something() + complicated_thing()
	elif is_substr(my_string, ["1", "2", "3"]) :
		x = do_something_else() + complicated_thing()
	elif is_substr(my_string, ["!", "#", "$"]) :
		x = do_another_thing() + complicated_thing()
	return x + ("Hello" if some_condition(x) else "World")


def awesome(my_string):
    x = do_something() + complicated_thing() if any(i in my_string for i in ["A", "B", "C"]) else \
        do_something_else() + complicated_thing() if any(i in my_string for i in ["1", "2", "3"]) else \
        do_another_thing() + complicated_thing() if any(i in my_string for i in ["!", "#", "$"]) else ''
    return x + ("Hello" if some_condition(x) else "World")






