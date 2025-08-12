def json_scan(json_obj, key) :
	result = None
	for element in json_obj :
		if str(element) == key :
			result = json_obj [element]
		else :
			if type(json_obj [element]) == DictType :
				result = json_scan(json_obj [element], key)
			elif type(json_obj [element]) == ListType :
				result = json_scan(element, key)
	return result



def json_scan(json_obj, key):
    if key in json_obj: 
        return json_obj[key]
    return next((v for k, v in filter(lambda kv: isinstance(kv[1], dict), json_obj.items()) if json_scan(v, key) is not None), None)



