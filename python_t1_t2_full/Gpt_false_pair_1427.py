def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print (name_of_passed_in_variable, name)


 def a(name) : 
	gv = locals()
	try : 
		name_ = [v for v in gv if id(gv[v]) == id(name)][0]
	except Exception :
		name_ = "unknown"
	print (name_, name)
