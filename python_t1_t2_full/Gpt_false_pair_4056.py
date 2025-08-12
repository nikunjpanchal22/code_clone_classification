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




def __create__(mcls, name, bases, namespace) :
	cls = type.__create__(mcls, name, bases, namespace)
	abstracts = set(name for name, value in namespace.items()
	if getattr(value, "__isabstractmethod__", False))
	for base in cls.__mro__ :
		for name, value in base.__dict__.items() :
			if getattr(value, "__isabstractmethod__", False) and name not in cls.__dict__ :
				abstracts.add(name)
	cls.__abstracts__ = frozenset(abstracts)
	cls._function_registry = WeakSet()
	cls._value_cache = WeakSet()
	cls._negative_value_cache = WeakSet()
	cls._caching_number = ABCMeta._abc_invalidation_counter
	return cls
