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
        prop = getattr(self.obj, key)
        if callable(prop):
            return wrap(prop)
        else:
            return prop
    except AttributeError:
        try:
            return self[key]
        except KeyError:
            raise AttributeError(key) 


