def __getattr__(self, key) :
	try :
		return self [key]
	except KeyError :
		raise AttributeError(key)


 def __getattribute__(self, name):
    try:
        return object.__getattribute__(self, name)
    except AttributeError:
        try:
            return self[name]
        except KeyError:
            raise AttributeError(name)


