def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None


 def access(obj, indexes) :
	for i in range(len(indexes)) :
		try :
			obj = obj[indexes[i]]
		except Exception :
			return None
	return obj


