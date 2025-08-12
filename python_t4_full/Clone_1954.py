def __call__(self, parser, namespace, values, option_string = None) :
	for value in values :
		try :
			n, v = value.split('=')
			setattr(namespace, n, v)
		except ValueError :
			setattr(namespace, '_unrecognized_args', values [values.index(value) :])


 def __call__(self, parser, namespace, values, option_string = None) :
	unrecognized_args = []
	arguments = {}
	for value in values :
		if '=' in value :
			n, v = value.split('=')
			arguments[n] = v
		else :
			unrecognized_args.append(value)
	for key, val in arguments.items():
		setattr(namespace, key, val)
	if any([not '=' in x for x in values]) :
		setattr(namespace, '_unrecognized_args', unrecognized_args)


