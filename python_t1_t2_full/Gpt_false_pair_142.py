def __init__(self, * args, ** kwargs) :
	super(Map, self).__init__(* args, ** kwargs)
	for arg in args :
		if isinstance(arg, dict) :
			for k, v in arg.iteritems() :
				self [k] = v
	if kwargs :
		for k, v in kwargs.iteritems() :
			self [k] = v


 def __init__(self, *args, **kw): 
	super(Map, self).__init__(*args, **kw)
	for a in args:
		if isinstance(a, dict):
			for key, item in a.items():
				self[key] = item
	if kw:
		for key, item in kw.items():
			self[key] = item
