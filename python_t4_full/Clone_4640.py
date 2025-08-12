def __call__(self, parser, namespace, values, option_string = None) :
	for value in values :
		try :
			n, v = value.split('=')
			setattr(namespace, n, v)
		except ValueError :
			setattr(namespace, '_unrecognized_args', values [values.index(value) :])



 

def __call__(self, parser, namespace, values, option_string=None):
    for v in values:
        v = v.split('=')
        if len(v) == 2:
            setattr(namespace, *v)


