def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print (name_of_passed_in_variable, name)


  def a(name):
	global_name = list(globals().items())
	name_of_passed_in_variable = ""
	for name1,name2 in global_name : 
		if id(name2) == id(name) : 
			name_of_passed_in_variable = name1
			break
	if name_of_passed_in_variable == "" : 
		name_of_passed_in_variable = "unknown"
	print (name_of_passed_in_variable, name)


