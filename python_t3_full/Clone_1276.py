def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print (name_of_passed_in_variable, name)


 def a(name) : 
	glob_var = locals()
	try :
		if name in glob_var: 
			passed_in_var = [i for i in glob_var if name == glob_var[i]][0]
	except Exception :
		passed_in_var = "unknown"
	print(passed_in_var, name)


