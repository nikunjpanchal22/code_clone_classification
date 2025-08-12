def __getattr__(self, key) :
	try :
		return wrap(getattr(self.obj, key))
	except AttributeError :
		try :
			return self [key]
		except KeyError :
			raise AttributeError(key)


 def __getattr__(self, key):
    descriptor = (getattr(self.obj, key, None) or self.get(key, None))
    if callable(descriptor):
        return wrap(descriptor)
    else:
        return descriptor


