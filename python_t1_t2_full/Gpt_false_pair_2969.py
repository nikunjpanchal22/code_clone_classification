def __getattr__(self, key) :
	try :
		return wrap(getattr(self.obj, key))
	except AttributeError :
		try :
			return self [key]
		except KeyError :
			raise AttributeError(key)




def __getattr__(self, key):
	try :
		return self._wrap_value(getattr(self.obj, key))
	except AttributeError :
		try :
			return self[key]
		except KeyError :
			raise AttributeError(key)
