def json_scan(json_obj, key) :
	d = json.loads(json_obj)
	for k in d:
		if k == key:
			return d[key]


 def json_scan(json_obj, key) :
    try:
        return json.loads(json_obj)[key]
    except:
        return None


