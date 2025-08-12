def __getattr__(self, key) :
	try :
		return wrap(getattr(self.obj, key))
	except AttributeError :
		try :
			return self [key]
		except KeyError :
			raise AttributeError(key)


 def __getattr__(self, key):
    if hasattr(self.obj, key):
        return wrap(getattr(self.obj, key))
    elif key in self:
        return self[key]
    else:
        raise AttributeError(key)


