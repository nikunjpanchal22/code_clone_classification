def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print (name_of_passed_in_variable, name)


 def a(name) :
	global_var = locals()
	try : 
		name_var = [f for f in global_var if id(global_var[f]) == id(name)][0]
	except Exception : 
		name_var = "unknown"
	print (name_var, name)
