def json_scan(json_obj, key) :
	d = json.loads(json_obj)
	for k in d:
		if k == key:
			return d[key]


 def json_scan(json_obj, key) :
    d = json.loads(json_obj)
    matched_key_value = [d[k] for k in d if k == key];
    if len(matched_key_value) > 0:
        return matched_key_value[0]
    else:
        return None


