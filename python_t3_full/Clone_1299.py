def find_subclasses(cls) :
	results = []
	for sc in cls.__subclasses__() :
		for obj in gc.get_objects() :
			if isinstance(obj, sc) :
				results.append(obj)
	return results


 def find_subclasses(cls):
    result = []
    for c in cls.__subclasses__():
        result += filter(lambda o: isinstance(o, c), gc.get_objects())
    return result


