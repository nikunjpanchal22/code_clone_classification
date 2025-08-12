def a(name) :
	global_variables = globals()
	try :
		name_of_passed_in_variable = [x for x in global_variables if id(global_variables [x]) == id(name)] [0]
	except Exception :
		name_of_passed_in_variable = "unknown"
	print name_of_passed_in_variable, name



 

def a(name):
	global_dict = dict(globals())
	try:
		name_descriptor = next(x for x in global_dict if id(global_dict[x]) == id(name))
	except StopIteration:
		name_descriptor = "unknown"


