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
	for parameter in args :
		if isinstance(parameter, dict) :
			for map_key, map_value in parameter.items() :
				if isinstance(map_value, dict) :
					map_value = Map(map_value)
				if isinstance(map_value, list) :
					self.__transform(map_value)
				self [map_key] = map_value
	if kwargs :
		for map_key, map_value in kwargs.items() :
			if isinstance(map_value, dict) :
				map_value = Map(map_value)
			elif isinstance(map_value, list) :
				self.__transform(map_value)
			self[map_key] = map_value
