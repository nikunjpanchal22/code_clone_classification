def __getattr__(self, key) :
	try :
		return wrap(getattr(self.obj, key))
	except AttributeError :
		try :
			return self [key]
		except KeyError :
			raise AttributeError(key)




def __getattribute__(self, key):
	try:
		return wrap(getattribute(self.obj, key))
	except AttributeError:
		try:
			return self[key]
		except KeyError:
			raise AttributeError(key)

