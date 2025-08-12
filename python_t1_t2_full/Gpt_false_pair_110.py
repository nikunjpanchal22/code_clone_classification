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


 def __init__(self, *args, **kwargs):
	super(Map, self).__init__(*args, **kwargs)
	for arg in args:
		if isinstance(arg, dict):
			for section, component in arg.items():
				if isinstance(component, dict):
					component = Map(component)
				elif isinstance(component, list):
					self.__adapt(component)
				self[section] = component
	if kwargs:
		for section, component in kwargs.items():
			if isinstance(component, dict):
				component = Map(component)
			elif isinstance(component, list):
				self.__adapt(component)
			self[section] = component
