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


		self.update(arg_dict)



def __init__(self, iterable = {}, ** kwargs) :
	super().__init__({})
	for arg_dict in [iterable, kwargs]:
		keys = set(arg_dict)
		for required_key in self.required:
			if required_key not in keys:
				raise AttributeError(f"{self.__class__.__name__} requires: {self.required}")


