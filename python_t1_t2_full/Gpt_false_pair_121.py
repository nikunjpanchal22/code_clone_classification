def __init__(self, * args, ** kwargs) :
	super(Map, self).__init__(* args, ** kwargs)
	for arg in args :
		if isinstance(arg, dict) :
			for k, v in arg.iteritems() :
				if isinstance(v, dict) :
					v = Map(v)
				if isinstance(v, list) :
					self.__convert(v)
				self [k] = v
	if kwargs :
		for k, v in kwargs.iteritems() :
			if isinstance(v, dict) :
				v = Map(v)
			elif isinstance(v, list) :
				self.__convert(v)
			self [k] = v


  def __init__(self, * args, ** kwargs) :
	super(Map, self).__init__(* args, ** kwargs)
	for arg in args :
		if isinstance(arg, dict) :
			for key, val in arg.items() :
				if isinstance(val, dict) :
					val = Map(val)
				if isinstance(val, list) :
					self.__convert(val)
				self[key] = val
	if kwargs :
		for key, val in kwargs.items() :
			if isinstance(val, dict) :
				val = Map(val)
			elif isinstance(val, list) :
				self.__convert(val)
			self[key] = val
