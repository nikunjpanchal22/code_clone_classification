def __getattr__(self, key) :
	try :
		return self [key]
	except KeyError :
		raise AttributeError(key)


 def __getattr__(self, key):
    if key in self:
        return self[key]
    elif hasattr(self.__class__, key):
        return getattr(self.__class__, key)
    else:
        raise AttributeError


