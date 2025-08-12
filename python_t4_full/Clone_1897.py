def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print (name_of_passed_in_variable, name)


   def a(name) :
	global_vars = list(globals().items())
	name_of_passed_in_variable = ""
	for var in global_vars: 
		if id(var[1]) == id(name): 
			name_of_passed_in_variable = var[0]
			break
	if name_of_passed_in_variable == "":
		name_of_passed_in_variable = "unknown"
	print (name_of_passed_in_variable, name)


