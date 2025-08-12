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
	map(self.update, filter(lambda arg: isinstance(arg, dict), args))


