def __call__(self, parser, namespace, values, option_string = None) :
	for value in values :
		try :
			n, v = value.split('=')
			setattr(namespace, n, v)
		except ValueError :
			setattr(namespace, '_unrecognized_args', values [values.index(value) :])




def __call__(self, interpreter, scope, inputs, option_string = None) : 
	for inp in inputs :
		try :
			key, val = inp.split('=')
			setattr(scope, key, val)
		except ValueError :
			setattr(scope, '_unrecognized_args', inputs [inputs.index(inp) :])
