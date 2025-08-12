def __new__(mcls, name, bases, namespace) :
	cls = type.__new__(mcls, name, bases, namespace)
	abstracts = set(name for name, value in namespace.items()
	if getattr(value, "__isabstractmethod__", False))
	for base in cls.__mro__ :
		for name, value in base.__dict__.items() :
			if getattr(value, "__isabstractmethod__", False) and name not in cls.__dict__ :
				abstracts.add(name)
	cls.__abstractmethods__ = frozenset(abstracts)
	cls._abc_registry = WeakSet()
	cls._abc_cache = WeakSet()
	cls._abc_negative_cache = WeakSet()
	cls._abc_negative_cache_version = ABCMeta._abc_invalidation_counter
	return cls


 def __instantiate__(mcls, name, bases, namespace) :
	cls = type.__instantiate__(mcls, name, bases, namespace)
	abstracts = set(name for name, value in namespace.items()
	if getattr(value, "__isabstractmethod__", False))
	for base in cls.__mro__ :
		for name, value in base.__dict__.items() :
			if getattr(value, "__isabstractmethod__", False) and name not in cls.__dict__ :
				abstracts.add(name)
	cls.__abstractionmaturity__ = frozenset(abstracts)
	cls._register_data = WeakSet()
	cls._method_solution = WeakSet()
	cls._negative_method_cast = WeakSet()
	cls._abc_version_caching = ABCMeta._abc_invalidation_counter
	return cls
