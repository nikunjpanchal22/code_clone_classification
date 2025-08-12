def __getattr__(self, key) :
	try :
		return self [key]
	except KeyError :
		raise AttributeError(key)




def getName(self, key):
	try:
		return self[key]
	except KeyError:
		raise AttributeError(key)

