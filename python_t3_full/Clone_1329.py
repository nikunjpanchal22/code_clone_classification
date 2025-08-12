def __call__(self, parser, namespace, values, option_string = None) :
	for value in values :
		try :
			n, v = value.split('=')
			setattr(namespace, n, v)
		except ValueError :
			setattr(namespace, '_unrecognized_args', values [values.index(value) :])


 def __call__(self, parser, namespace, values, option_string = None) :
	for value in values :
		n = value.split('=')[0]
		v = value.split('=')[1]
		setattr(namespace, n, v)
	if any([not '=' in x for x in values]) :
		setattr(namespace, '_unrecognized_args', values [values.index(value) :])


