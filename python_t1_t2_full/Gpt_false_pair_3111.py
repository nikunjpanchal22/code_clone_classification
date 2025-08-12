def acquire_data(arg) :
	if isinstance(arg, file) :
		data = arg.read()
	elif isinstance(arg, basestring) :
		data = open(arg, 'r').read()
	else :
		data = arg




def acquire_data(arg) :
	if isinstance(arg, file):
		data = arg.read()
	elif isinstance(arg, str):
		data = open(arg, 'r').read()
	else :
		data = arg
