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
    print ("object received:")
    print(type(obj))
    print ("\n\n")
    if isinstance(obj, collections.Mapping):
        for key, value in obj.iteritems():
            if isinstance(value, (collections.Mapping, collections.MutableSequence)):
                value = json_debug_handler(value)
            obj[key] = convert(value)
    elif isinstance(obj, collections.MutableSequence):
        index = 0
        while index < len(obj):
            if isinstance(obj[index], (collections.Mapping, collections.MutableSequence)):
                obj[index] = json_debug_handler(obj[index])
            obj[index] = convert(obj[index])
            index += 1
    return obj


