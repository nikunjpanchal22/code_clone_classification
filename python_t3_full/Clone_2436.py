def json_debug_handler(obj) :
	print ("object received:")
	print type(obj)
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



import collections, json

def json_debug_handler(obj):
    def check_value_type(value):
        if isinstance(value, (collections.Mapping, collections.MutableSequence)):
            value = json_debug_handler(value)
        else:
            value = json.dumps(value)
        return value
    
    print(f"Object received: {type(obj)}\n")
    if isinstance(obj, collections.Mapping):
        for key, value in obj.items():
            obj[key] = check_value_type(value)
    elif isinstance(obj, collections.MutableSequence):
        for idx, value in enumerate(obj):
            obj[idx] = check_value_type(value)
    return obj





