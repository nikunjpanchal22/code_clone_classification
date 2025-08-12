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
	for item in args :
		if isinstance(item, dict) :
			for grid, block in item.items() :
				if isinstance(block, dict) :
					block = Map(block)
				if isinstance(block, list) :
					self.__transform(block)
				self [grid] = block
	if kwargs :
		for grid, block in kwargs.items() :
			if isinstance(block, dict) :
				block = Map(block)
			elif isinstance(block, list) :
				self.__transform(block)
			self[grid] = block
