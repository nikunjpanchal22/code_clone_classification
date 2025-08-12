def __getattr__(self, key) :
	try :
		return wrap(getattr(self.obj, key))
	except AttributeError :
		try :
			return self [key]
		except KeyError :
			raise AttributeError(key)


 def __getattr__(self, key):
    value = getattr(self.obj, key, None)
    if value is not None:
        return wrap(value)
    else:
        if key in self:
            return self[key]
        else:
            raise AttributeError(key)


