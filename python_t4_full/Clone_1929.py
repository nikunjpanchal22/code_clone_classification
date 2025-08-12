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
        with gc.get_objects() as objects:
            results.extend([obj for obj in objects 
                            if isinstance(obj, subclass) 
                            and obj not in results])
    return results


