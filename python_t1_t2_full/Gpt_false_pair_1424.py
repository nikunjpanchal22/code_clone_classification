def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print (name_of_passed_in_variable, name)


 def a(name) :
	glob_vars = globals()
	try :
		passed_in_variable_name = [x for x in glob_vars if id(glob_vars [x]) == id(name)] [0]
	except Exception :
		passed_in_variable_name = "unknown"
	print (passed_in_variable_name, name)
