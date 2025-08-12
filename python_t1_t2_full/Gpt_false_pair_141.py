def __init__(self, * args, ** kwargs) :
	super(Map, self).__init__(* args, ** kwargs)
	for arg in args :
		if isinstance(arg, dict) :
			for k, v in arg.iteritems() :
				self [k] = v
	if kwargs :
		for k, v in kwargs.iteritems() :
			self [k] = v


 def __init__(self, *values, **attributes):
	super(Map,self).__init__(*values, **attributes)
	for arg in values:
		if isinstance(arg, dict):
			for key, entries in arg.items():
				self[key] = entries
	if attributes:
		for key, entries in attributes.items():
			self[key] = entries
