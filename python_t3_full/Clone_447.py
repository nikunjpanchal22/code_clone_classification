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


 def json_scan(json_obj, key) :
	result = None
	if key in json_obj :
		result = json_obj[key]
	else :
		for element in json_obj :
			if type(json_obj[element]) == dict :
				ret = json_scan(json_obj[element], key)
				if ret is not None :
					result = ret
			elif type(json_obj[element]) == list :
				for sub_element in element :
					ret = json_scan(sub_element, key)
					if ret is not None :
						result = ret
	return result


