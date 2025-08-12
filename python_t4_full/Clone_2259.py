def __call__(cls, alias, * args, ** kwargs) :
	if cls ! = Bullet :
		raise TypeError("Bullet subclass %r objects should not to "
		"be explicitly constructed." % cls.__name__)
	elif alias not in cls.registry :
		raise NotImplementedError("Unknown Bullet subclass %r" %
		str(alias))
	subclass = cls.registry [alias]
	return type.__call__(subclass, * args, ** kwargs)


 def __call__(cls, alias, * args, ** kwargs) :
  if cls != type(Bullet):
    raise TypeError("Bullet subclass %r objects should not be explicitly constructed." % cls.__name__)
  elif not alias in cls.registry:
    raise NotImplementedError("Unknown Bullet subclass %r" % str(alias))
  subclass = cls.registry[alias]
  return type.__call__(subclass, *args, **kwargs)


