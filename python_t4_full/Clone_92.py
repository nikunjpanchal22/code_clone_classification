def __getattr__(self, key) :
	try :
		return self [key]
	except KeyError :
		raise AttributeError(key)


 def __getattr__(self, key):
    if key in self:
        return self[key]
    else:
        try:
            return object.__getattribute__(self.__class__, key)
        except AttributeError:
            raise AttributeError(key)


