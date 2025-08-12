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
    def verify_type(val):
        return isinstance(val, (collections.Mapping, collections.MutableSequence))
    print("Object received:", repr(type(obj)))   
    if isinstance(obj, collections.Mapping):
      for key, value in obj.items():
          if verify_type(value):
              value = json_debug_handler(value)
          obj[key] = json.dumps(value)       
    elif isinstance(obj, collections.MutableSequence):
        for i, value in enumerate(obj):
            if verify_type(value):
                value = json_debug_handler(value)
            obj[i] = json.dumps(value)    
    return obj


