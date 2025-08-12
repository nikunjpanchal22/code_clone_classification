def find_subclasses(cls) :
	results = []
	for sc in cls.__subclasses__() :
		for obj in gc.get_objects() :
			if isinstance(obj, sc) :
				results.append(obj)
	return results


 def find_subclasses(cls):
    subclasses = cls.__subclasses__()
    return [obj for obj in gc.get_objects() 
            if any([isinstance(obj, sc) for sc in subclasses]) 
            and obj not in results]


