def find_subclasses(cls) :
	results = []
	for sc in cls.__subclasses__() :
		for obj in gc.get_objects() :
			if isinstance(obj, sc) :
				results.append(obj)
	return results


 def find_subclasses(cls):
    results = []
    for subclass in cls.__subclasses__():
        for obj in gc.get_objects():
            if obj not in results and isinstance(obj, subclass):
                results.append(obj)
    return results
