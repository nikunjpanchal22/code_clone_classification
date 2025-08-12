def __init__(self, * args, ** kwargs) :
	super(Map, self).__init__(* args, ** kwargs)
	for arg in args :
		if isinstance(arg, dict) :
			for k, v in arg.iteritems() :
				self [k] = v
	if kwargs :
		for k, v in kwargs.iteritems() :
			self [k] = v




def __init__(self, *args, **kwargs):
	super(Map, self).__init__(*args, **kwargs)
	for argument in args:
		if isinstance(argument, dict):
			for theKey, theValue in argument.items():
				self[theKey] = theValue
	if kwargs:
		for theKey, theValue in kwargs.items():
			self[theKey] = theValue
