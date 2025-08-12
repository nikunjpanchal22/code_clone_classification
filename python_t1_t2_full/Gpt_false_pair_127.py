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
			for k, v in dict.items(arg) :
				if isinstance(v, dict) :
					v = Map(v)
				if isinstance(v, list) :
					self.__convert(v)
				dict.__setitem__(self, k, v)
	if kwargs :
		for k, v in dict.items(kwargs) :
			if isinstance(v, dict) :
				v = Map(v)
			elif isinstance(v, list) :
				self.__convert(v)
			dict.__setitem__(self, k, v)
