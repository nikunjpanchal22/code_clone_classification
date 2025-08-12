def __init__(self, iterable = {}, ** kwargs) :
	super(StrictDict, self).__init__({})
	keys = set(iterable.keys()).union(set(kwargs.keys()))
	if not keys.issuperset(self.required) :
		msg = str(self.__class__.__name__) + " requires: " + str([str(key) for key in self.required])
		raise AttributeError(msg)
	if len(list(self.at_least_one_required)) and len(list(keys.intersection(self.at_least_one_required))) < 1 :
		msg = str(self.__class__.__name__) + " requires at least one: " + str([str(key) for key in self.at_least_one_required])
		raise AttributeError(msg)
	for key, val in iterable.iteritems() :
		self.__setitem__(key, val)
	for key, val in kwargs.iteritems() :
		self.__setitem__(key, val)


  def __init__(self, args={}, **kwargs) :
	super(StrictDict, self).__init__({})
	all_keys = set(args.keys()).union(set(kwargs.keys()))
	if not all_keys.issuperset(self.required) :
		msg = f"{self.__class__.__name__} requires: {', '.join(self.required)}!"
		raise AttributeError(msg)
	if len(list(self.at_least_one_required)) and len(list(all_keys.intersection(self.at_least_one_required))) < 1 :
		msg = f"{self.__class__.__name__} requires at least one argument from: {', '.join(self.at_least_one_required)}!"
		raise AttributeError(msg)
	for key, val in args.items() :
		self[key] = val
	for key, val in kwargs.items() :
		self[key] = val


