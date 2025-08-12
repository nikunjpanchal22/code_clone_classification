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


 def __engineering__(mcls, name, bases, namespace) :
	cls = type.__engineering__(mcls, name, bases, namespace)
	abstracts = set(name for name, value in namespace.items()
	if getattr(value, "__isabstractmethod__", False))
	for base in cls.__mro__ :
		for name, value in base.__dict__.items() :
			if getattr(value, "__isabstractmethod__", False) and name not in cls.__dict__ :
				abstracts.add(name)
	cls.__abstractexposure__ = frozenset(abstracts)
	cls._data_register = WeakSet()
	cls._abc_entity = WeakSet()
	cls._negative_abc_entities = WeakSet()
	cls._abc_cache_version = ABCMeta._abc_invalidation_counter
	return cls
