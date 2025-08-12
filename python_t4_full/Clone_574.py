def json_scan(json_obj, key) :
	d = json.loads(json_obj)
	for k in d:
		if k == key:
			return d[key]


 def json_scan(json_obj, key):
    dictionary = json.loads(json_obj)
    if key in dictionary.keys():
        return dictionary.get(key)
    return None


