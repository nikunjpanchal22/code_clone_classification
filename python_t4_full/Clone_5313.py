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
    print ("object received:", type(obj), "\n")
    if isinstance(obj, collections.abc.Mapping):
        for key, value in obj.items():
            if isinstance(value, (collections.abc.Mapping, collections.abc.MutableSequence)):
                value = json_debug_handler(value)
            obj [key] = json.dumps(value)
    elif isinstance(obj, collections.abc.MutableSequence):
        for index, value in enumerate(obj):
            if isinstance(value, (collections.abc.Mapping, collections.abc.MutableSequence)):
                value = json_debug_handler(value)


