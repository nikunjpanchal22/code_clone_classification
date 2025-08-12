def __getattr__(self, key) :
	try :
		return wrap(getattr(self.obj, key))
	except AttributeError :
		try :
			return self [key]
		except KeyError :
			raise AttributeError(key)


 def __getattr__(self, key):
    try:
        return wrap(getattr(self.obj, key))
    except AttributeError:
        try:
            return self[key]
        except KeyError:
            if key in self.__dict__:
                return self.__dict__[key]
            else:
                raise AttributeError(key)


