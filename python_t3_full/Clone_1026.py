def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None


 def access(obj, indexes) :
	try :
		for index in indexes :
			obj = obj[index]
	except Exception :
		return None
	return obj


