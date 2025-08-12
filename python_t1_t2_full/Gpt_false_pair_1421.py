def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print (name_of_passed_in_variable, name)


 def a(name) :
	globals_ = globals()
	try :
		pass_in_var = [r for r in globals_ if id(globals_ [r]) == id(name)] [0]
	except Exception :
		pass_in_var = "unknown"
	print (pass_in_var, name )
