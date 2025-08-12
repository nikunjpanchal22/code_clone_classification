def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None


 def access(obj, indexes) :
	if len(indexes) == 0 :
		return obj
	try :
		curr = obj[indexes[0]]
		res = access(curr, indexes[1:])
	except Exception :
		return None
	return res


