def find_subclasses(cls) :
	results = []
	for sc in cls.__subclasses__() :
		for obj in gc.get_objects() :
			if isinstance(obj, sc) :
				results.append(obj)
	return results


 def find_subclasses(cls):
    results = list()
    for subcls in cls.__subclasses__():
        for obj in gc.get_objects():
            valid_subcls = isinstance(obj, subcls)
            not_already_in_result = obj not in results
            if valid_subcls and not_already_in_result:
                results.append(obj)
    return results


