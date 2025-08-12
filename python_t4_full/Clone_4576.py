def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print name_of_passed_in_variable, name




def a(name):
	global_vars = globals()
	for x in global_vars:
		if id(global_vars[x]) == id(name):
			print(x, name)
			break
	else:
		print('unknown', name)


