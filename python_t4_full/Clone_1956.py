def __call__(self, parser, namespace, values, option_string = None) :
	for value in values :
		try :
			n, v = value.split('=')
			setattr(namespace, n, v)
		except ValueError :
			setattr(namespace, '_unrecognized_args', values [values.index(value) :])


 def __call__(self, parser, namespace, values, option_string = None) :
	unrecognized_args = []
	for value in values :
		if '=' in value :
			try :
				n, v = value.split('=',1)
				setattr(namespace, n, v)
			except ValueError :
				unrecognized_args.append(value)
		else : 
			unrecognized_args.append(value)
	setattr(namespace, '_unrecognized_args', unrecognized_args)


