def awesome(my_string) :
	if is_substr(my_string, ["A", "B", "C"]) :
		x = do_something() + complicated_thing()
	elif is_substr(my_string, ["1", "2", "3"]) :
		x = do_something_else() + complicated_thing()
	elif is_substr(my_string, ["!", "#", "$"]) :
		x = do_another_thing() + complicated_thing()
	return x + ("Hello" if some_condition(x) else "World")


def awesome(my_string) :
    x = 0 
    result = None

    if is_substr(my_string, ["A", "B", "C"]):
        x = do_something() + complicated_thing()
    elif is_substr(my_string, ["1", "2", "3"]):
        x = do_something_else() + complicated_thing()
    elif is_substr(my_string, ["!", "#", "$"]):
        x = do_another_thing() + complicated_thing()

    if some_condition(x):
        result = "Hello" + x
    else:
        result = "World" + x
    return result




