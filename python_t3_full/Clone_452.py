def json_scan(json_obj, key) :
	d = json.loads(json_obj)
	for k in d:
		if k == key:
			return d[key]


 def json_scan(json_obj, key) :
	d = json.loads(json_obj)
	for k, v in d.iteritems():
		if k == key:
			return v


