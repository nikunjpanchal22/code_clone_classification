def __getattr__(self, key) :
	try :
		return self [key]
	except KeyError :
		raise AttributeError(key)


 def __getattr__(self, key):
    try:
        return self[key]
    except:
        try:
            return super(self.__class__, self).__getattr__(key)
        except AttributeError:
            raise AttributeError(key)


