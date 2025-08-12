def __call__(self, parser, namespace, values, option_string = None) :
	for value in values :
		try :
			n, v = value.split('=')
			setattr(namespace, n, v)
		except ValueError :
			setattr(namespace, '_unrecognized_args', values [values.index(value) :])



 

def __call__(self, parser, namespace, values, option_string=None):
    [setattr(namespace, *v.split('=')) if '=' in v else setattr(namespace, '_unrecognized_args', values) for v in values]

 

def __call__(self, parser, namespace, values, option_string=None):
    def _get_key_val(value):
        return value.split('=')


