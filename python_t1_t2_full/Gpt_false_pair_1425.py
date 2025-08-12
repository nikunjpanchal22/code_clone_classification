def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print (name_of_passed_in_variable, name)


 def a(name) :
	global_v = locals()
	try :
		name_p = [g for g in global_v if id(global_v[g]) == id(name)][0]
	except Exception :
		name_p = "unknown"
	print (name_p, name)
