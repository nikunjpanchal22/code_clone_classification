def json_debug_handler(obj) :
	print ("object received:")
	print(type(obj))
	print ("\n\n")
	if isinstance(obj, collections.Mapping) :
		for key, value in obj.iteritems() :
			if isinstance(value, (collections.Mapping, collections.MutableSequence)) :
				value = json_debug_handler(value)
			obj [key] = convert(value)
	elif isinstance(obj, collections.MutableSequence) :
		for index, value in enumerate(obj) :
			if isinstance(value, (collections.Mapping, collections.MutableSequence)) :
				value = json_debug_handler(value)
			obj [index] = convert(value)
	return obj


  def json_debug_handler(obj):
    print("Object received:")
    print(type(obj))
    print("\n\n")
    if isinstance(obj, (dict, collections.Mapping)):
        updated_dict = {}
        for key, value in obj.items():
            if isinstance(value, (collections.Mapping, collections.MutableSequence)):
                value = json_debug_handler(value)
            updated_dict[key] = convert(value)
        obj = updated_dict
    elif isinstance(obj, collections.MutableSequence):
        for val in obj:
            if isinstance(val, (collections.Mapping, collections.MutableSequence)):
                val = json_debug_handler(val)
            obj.remove(val)
            obj.append(convert(val))
    return obj


