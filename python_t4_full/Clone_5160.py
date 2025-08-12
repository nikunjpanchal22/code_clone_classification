def acquire_data(arg) :
	if isinstance(arg, file) :
		data = arg.read()
	elif isinstance(arg, basestring) :
		data = open(arg, 'r').read()
	else :
		data = arg




def acquire_data(arg):
    import io
    if isinstance(arg, io.IOBase):
        data = arg.read()
    elif isinstance(arg, str):
        with open(arg, 'r') as f:
            data = f.read()


