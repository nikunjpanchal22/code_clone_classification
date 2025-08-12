def __init__(self, obj) :
	if self.__wraps__ is None :
		raise TypeError("base class Wrapper may not be instantiated")
	elif isinstance(obj, self.__wraps__) :
		self._obj = obj
	else :
		raise ValueError("wrapped object must be of %s" % self.__wraps__)


 def __init__(self, obj) :
  if self.__wraps__ == None:
    raise TypeError('base class Wrapper may not be instantiated')
  elif type(obj).__name__ != self.__wraps__.__name__:
    raise ValueError('wrapped object must be of %s' % self.__wraps__)
  else:
    self._obj = obj


