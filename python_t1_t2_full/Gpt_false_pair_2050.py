def json_debug_handler(obj) :
	print ("object received:")
	print (type(obj))
	print ("\n\n")
	if isinstance(obj, datetime.datetime) :
		return obj.isoformat()
	elif isinstance(obj, MStuff) :
		attrs = {}
		for key in obj.__dict__ :
			if not (key.startswith("_") or key == "content") :
				attrs [key] = obj.__dict__ [key]
		return {'orig' : obj.content, 'attrs' : attrs}
	else :
		return None


def json_debug_handler(obj):
	print ("object received:")
	print (type(obj))
	print ("\n\n")
	if isinstance(obj, datetime.datetime) :
		return obj.strftime('%Y-%m-%dT%H:%M:%S')
	elif isinstance(obj, MStuff) :
		attrs = {}
		for key,value in obj.__dict__.items():
			if not (key.startswith("_") or key == "content") :
				attrs [key] = obj.__dict__[key]
		return {'orig' : obj.content, 'params' : attrs}
	else :
		return None

