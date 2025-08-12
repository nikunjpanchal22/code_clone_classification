def awesome(my_string) :
	if is_substr(my_string, ["A", "B", "C"]) :
		x = do_something() + complicated_thing()
	elif is_substr(my_string, ["1", "2", "3"]) :
		x = do_something_else() + complicated_thing()
	elif is_substr(my_string, ["!", "#", "$"]) :
		x = do_another_thing() + complicated_thing()
	return x + ("Hello" if some_condition(x) else "World")


def awesome(my_string):
    x = 0
    end_result = ""
    
    if is_substr(my_string, ["A", "B", "C"]):
        x = do_something() + complicated_thing()
    elif is_substr(my_string, ["1", "2", "3"]):
        X = do_something_else() + complicated_thing()
    elif is_substr(my_string, ["!", "#", "$"]):
        X = do_another_thing() + complicated_thing()

    if some_condition(x):
        end_result = str(x) + "Hello"
    else: 
        end_result = str(x) + "World"

    return end_result



