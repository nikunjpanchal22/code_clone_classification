def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print (name_of_passed_in_variable, name)


 def a(name) :
	glob_vals = globals()
	try :
		pass_in_va = [h for h in glob_vals if id(glob_vals [h]) == id(name)] [0]
	except Exception :
		pass_in_va = "unknown"
	print (pass_in_va, name )
