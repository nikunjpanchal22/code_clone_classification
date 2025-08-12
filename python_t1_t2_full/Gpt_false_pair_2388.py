def awesome(my_string) :
	if is_substr(my_string, ["A", "B", "C"]) :
		x = do_something() + complicated_thing()
	elif is_substr(my_string, ["1", "2", "3"]) :
		x = do_something_else() + complicated_thing()
	elif is_substr(my_string, ["!", "#", "$"]) :
		x = do_another_thing() + complicated_thing()
	return x + ("Hello" if some_condition(x) else "World")




def awesome(my_string) :
	if is_substr(my_string, ["A", "B", "C"]) :
		x = execute_task() + complex_process()
	elif is_substr(my_string, ["1", "2", "3"]) :
		x = complete_task() + complex_process()
	elif is_substr(my_string, ["!", "#", "$"]) :
		x = perform_activity() + complex_process()
	return x + ("Hello" if certain_condition(x) else "World")
