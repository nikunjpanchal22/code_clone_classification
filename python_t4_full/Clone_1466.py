def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None


 def access(obj, indexes) :
	curr = obj
	for index in indexes :
		if type(curr) is list :
			curr = curr[index]
			prev = curr
		elif type(prev) is list :
			try :
				curr = prev[index]
			except Exception :
				return None
	return curr


