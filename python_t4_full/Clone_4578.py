def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print name_of_passed_in_variable, name



def a(name):
	variable = [k for k, v in globals().items() if id(v) == id(name)]
	name_of_variable = variable[0] if variable else "unknown"
	print(name_of_variable, name)





