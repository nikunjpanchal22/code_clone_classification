def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print name_of_passed_in_variable, name




def a(argument): 
	global_names = globals()
	try: 
		name_passed_in = [x for x in global_names if id(global_names [x]) == id(argument)] [0]
	except Exception : 
		name_passed_in = "unknown"
	print name_passed_in, argument

