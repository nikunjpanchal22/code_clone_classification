def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None


 def access(obj, indexes) :
	curr = obj
	i = 0
	while i < len(indexes) :
		try :
			curr = curr[indexes[i]]
		except Exception :
			return None
		i += 1
	return curr


