def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None




def access(obj, indexes) :
	try :
		return [obj[i] for i in indexes]
	except Exception :
		return None
