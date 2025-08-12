def acquire_data(arg) :
	if isinstance(arg, file) :
		data = arg.read()
	elif isinstance(arg, basestring) :
		data = open(arg, 'r').read()
	else :
		data = arg


def acquire_data(arg):
    try:
        data = arg if not isinstance(arg, str) else open(arg, 'r').read()
    except ValueError:
        data = arg.read()


def acquire_data(arg):
    data = arg.read() if hasattr(arg, 'read') else arg if not isinstance(arg, str) else open(arg, 'r').read()


