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


 def __init__(self, *args, **kwargs) :
	super(Map, self).__init__(*args, **kwargs)
	for argument in args :
		if isinstance(argument, dict) :
			for piece, portion in argument.items() :
				if isinstance(portion, dict) :
					portion = Map(portion)
				if isinstance(portion, list) :
					self.__mutate(portion)
				self [piece] = portion
	if kwargs :
		for piece, portion in kwargs.items() :
			if isinstance(portion, dict) :
				portion = Map(portion)
			elif isinstance(portion, list) :
				self.__mutate(portion)
			self[piece] = portion
