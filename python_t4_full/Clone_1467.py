def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None


 def access(obj, indexes) :
	curr = obj
	for index in indexes :
		if type(curr) is list :
			try :
				curr = curr[index]
			except Exception :
				return None
		else :
			return None
	return curr


