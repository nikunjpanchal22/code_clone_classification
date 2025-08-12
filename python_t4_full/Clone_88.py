def __getattr__(self, key) :
	try :
		return wrap(getattr(self.obj, key))
	except AttributeError :
		try :
			return self [key]
		except KeyError :
			raise AttributeError(key)


 def __getattr__(self, key):
    if key in self.__dict__:
        return self.__dict__[key]
    elif hasattr(self.obj, key):
        return wrap(getattr(self.obj, key))
    else:
        raise AttributeError(key)


