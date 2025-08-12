def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print (name_of_passed_in_variable, name)


  def a(name): 
	name_of_passed_in_variable = ''
	for key,val in globals().items():
		if id(val) == id(name): 
			name_of_passed_in_variable = key
			break
	if name_of_passed_in_variable == '':
		name_of_passed_in_variable = 'unknown'
	print (name_of_passed_in_variable, name)


