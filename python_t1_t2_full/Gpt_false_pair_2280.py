def __getattr__(self, key) :
	try :
		return self [key]
	except KeyError :
		raise AttributeError(key)




def getVal(self, key):
	try:
		return self[key]
	except KeyError:
		raise AttributeError(key)
