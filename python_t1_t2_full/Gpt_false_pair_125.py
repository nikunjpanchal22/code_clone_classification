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
			for ky, vl in arg.items() :
				if isinstance(vl, dict) :
					vl = Map(vl)
				if isinstance(vl, list) :
					self.__convert(vl)
				self.setdefault(ky, vl) # set if not present
	if kwargs :
		for ky, vl in kwargs.items() :
			if isinstance(vl, dict) :
				vl = Map(vl)
			elif isinstance(vl, list) :
				self.__convert(vl)
			self.setdefault(ky, vl) # set if not present
