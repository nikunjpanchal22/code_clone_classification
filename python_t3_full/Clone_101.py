def __init__(self, * args, ** kwargs) :
	super(Map, self).__init__(* args, ** kwargs)
	for arg in args :
		if isinstance(arg, dict) :
			for k, v in arg.iteritems() :
				self [k] = v
	if kwargs :
		for k, v in kwargs.iteritems() :
			self [k] = v


  def __init__(self, *params, **kwargs) :
	super(Map, self).__init__(*params, **kwargs)
	for param in params :
		if isinstance(param, dict) :
			for k in param.keys() :
				self[k] = param[k]
	if kwargs :
		for k in kwargs.keys() :
			self[k] = kwargs[k]


