def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print (name_of_passed_in_variable, name)


 def a(name) :
	vars_glob = globals()
	try :
		pass_variable_name = [c for c in vars_glob if id(vars_glob [c]) == id(name)] [0]
	except Exception :
		pass_variable_name = "unknown"
	print (pass_variable_name, name)
