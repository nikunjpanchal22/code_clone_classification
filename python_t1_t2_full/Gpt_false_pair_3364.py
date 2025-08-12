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
			for _, item in arg.items() :
				if isinstance(item, dict) :
					item = Map(item)
				if isinstance(item, list) :
					self.__convert(item)
				self[_] = item
	if kwargs :
		for key, value in kwargs.items() :
			if isinstance(value, dict) :
				value = Map(value)
			elif isinstance(value, list) :
				self.__convert(value)
			self[key] = value
