def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None


	return functools.reduce(lambda o, i: o[i] if isinstance(o, list) or isinstance(o, dict) else None, indexes, obj)


 

def access(obj, indexes):
	for index in indexes:
		if hasattr(obj, '__getitem__'):
			try:
				obj = obj[index]


