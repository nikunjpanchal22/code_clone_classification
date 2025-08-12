def __init__(self, * args, ** kwargs) :
	super(Map, self).__init__(* args, ** kwargs)
	for arg in args :
		if isinstance(arg, dict) :
			for k, v in arg.iteritems() :
				self [k] = v
	if kwargs :
		for k, v in kwargs.iteritems() :
			self [k] = v


 def __init__(self, *argu, **args):
	super(Map, self).__init__(*argu, **args)
	for item in argu:
		if isinstance(item, dict):
			for key, value in item.items():
				self[key]= value
	if args:
		for key, value in args.items():
			self[key] = value
