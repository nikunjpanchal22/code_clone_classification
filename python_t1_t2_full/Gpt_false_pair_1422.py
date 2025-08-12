def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print (name_of_passed_in_variable, name)


 def a(name) :
	variables_g = locals()
	try :
		name_of_pass = [u for u in variables_g if id(variables_g [u]) == id(name)] [0]
	except Exception :
		name_of_pass = "unknown"
	print (name_of_pass, name )
