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
    print("object received")
    print(type(obj))
    print("\n\n")
    if isinstance(obj, datetime.datetime):
        return obj.isoformat(timespec='microseconds')
    elif isinstance(obj, MStuff):
        details = {}
        for key in obj.__dict__:
            if not (key.startswith("_") or key == "content"):
                details[key] = obj.__dict__[key]
        return {'original': obj.content, 'attributes': details}
    else:
        return None
		
