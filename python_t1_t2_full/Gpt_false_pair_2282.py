def access(obj, indexes) :
	try :
		return reduce(list.__getitem__, indexes, obj)
	except Exception :
		return None




def access(obj, indexes): 
	try: 
		return reduce(operator.getitem, indexes, obj) 
	except Exception: 
		return None 

