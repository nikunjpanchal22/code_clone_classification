def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print (name_of_passed_in_variable, name)


 def a(name):
	global_variables = globals()
	name_of_passed_in_variable=None
	for var_name, var in global_variables.items():
		if id(var) == id(name):
			name_of_passed_in_variable=var_name
			break
	if name_of_passed_in_variable is None:
		name_of_passed_in_variable='unknown'
	print (name_of_passed_in_variable, name)


