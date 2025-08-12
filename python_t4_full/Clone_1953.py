def __call__(self, parser, namespace, values, option_string = None) :
	for value in values :
		try :
			n, v = value.split('=')
			setattr(namespace, n, v)
		except ValueError :
			setattr(namespace, '_unrecognized_args', values [values.index(value) :])


 def __call__(self, parser, namespace, values, option_string = None) :
	unknown = []
	tokens = {}
	for value in values :
		if '=' in value :
			n, v = value.split('=',1)
			tokens[n] = v
		else :
			unknown.append(value)
	for key, val in tokens.items():
		setattr(namespace, key, val)
	if any([not '=' in x for x in values]) :
		setattr(namespace, '_unrecognized_args', unknown)


