def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print name_of_passed_in_variable, name




def a(name): 
	reserved_keywords = globals()
	try: 
		name_of_passed_in_variable = [x for x in reserved_keywords if id(reserved_keywords [x]) == id(name)] [0]
	except Exception : 
		name_of_passed_in_variable = "unknown"
	print name_of_passed_in_variable, name

