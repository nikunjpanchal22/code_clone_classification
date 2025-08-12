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
	for parameter in args :
		if isinstance(parameter, dict) :
			for ky, val in parameter.items() :
				if isinstance(val, dict) :
					val = Map(val)
				if isinstance(val, list) :
					self.__convert(val)
				self[ky] = val
	if kwargs :
		for ky, val in kwargs.items() :
			if isinstance(val, dict) :
				val = Map(val)
			elif isinstance(val, list) :
				self.__convert(val)
			self[ky] = val

