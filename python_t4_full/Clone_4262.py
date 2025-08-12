def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None


def access(obj, indexes):
	try:
		for i in indexes:
			obj = obj[i]
	except (IndexError, KeyError):
		return None
	return obj



