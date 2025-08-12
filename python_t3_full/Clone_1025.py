def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None


 def access(obj, indexes) :
	for index in indexes :
		try :
			obj = obj[index]
		except Exception :
			return None
	return obj


