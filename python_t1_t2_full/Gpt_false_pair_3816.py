def __call__(self, parser, namespace, values, option_string = None) :
	for value in values :
		try :
			n, v = value.split('=')
			setattr(namespace, n, v)
		except ValueError :
			setattr(namespace, '_unrecognized_args', values [values.index(value) :])




def __call__(self, interpreter, namespace, parameters, option_string = None) :  
	for param in parameters :
		try :
			name, value = param.split('=')
			setattr(namespace, name, value)
		except ValueError :
			setattr(namespace, '_unrecognized_args', parameters [parameters.index(param) :])

