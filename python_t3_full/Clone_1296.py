def find_subclasses(cls) :
	results = []
	for sc in cls.__subclasses__() :
		for obj in gc.get_objects() :
			if isinstance(obj, sc) :
				results.append(obj)
	return results


 def find_subclasses(cls):
    results = []
    subcls_list = cls.__subclasses__()
    for obj in gc.get_objects():
        valid_subclass =  any([isinstance(obj, subcls) for subcls in subcls_list])
        if valid_subclass and obj not in results:
            results.append(obj)
    return results


