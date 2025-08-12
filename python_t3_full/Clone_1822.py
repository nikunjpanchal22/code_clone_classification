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
    if isinstance(obj, dict):
        _temp_dict = {}
        for key, value in obj.items():
            if isinstance(value, (collections.Mapping, collections.MutableSequence)):
                value = json_debug_handler(value)
            _temp_dict[key] = convert(value)
        obj = _temp_dict
    elif isinstance(obj, list):
        _temp_list = []
        for index, value in enumerate(obj):
            if isinstance(value, (collections.Mapping, collections.MutableSequence)):
                value = json_debug_handler(value)
            _temp_list.append(convert(value))
        obj = _temp_list
    return obj


