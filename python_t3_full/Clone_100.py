def __init__(self, * args, ** kwargs) :
	super(Map, self).__init__(* args, ** kwargs)
	for arg in args :
		if isinstance(arg, dict) :
			for k, v in arg.iteritems() :
				self [k] = v
	if kwargs :
		for k, v in kwargs.iteritems() :
			self [k] = v


 def __init__(self, *obj, **items):
	super(Map, self).__init__(*obj, **items)
	if obj:
		for e in obj:
			if isinstance(e, dict):
				for k, v in e.items():
					self[k] = v
	if items:
		for i in items:
			self[i] = items[i]


