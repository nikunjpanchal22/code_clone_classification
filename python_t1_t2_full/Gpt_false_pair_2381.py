def find_subclasses(cls) :
	results = []
	for sc in cls.__subclasses__() :
		for obj in gc.get_objects() :
			if isinstance(obj, sc) :
				results.append(obj)
	return results




def find_subclasses(cls) :
	results = []
	for sc in cls.__subclasses__() :
		for obj in cls.__dict__.values() :
			if isinstance(obj, sc) :
				results.append(obj)
	return results

