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
        return obj.isoformat(timespec='seconds')
    elif isinstance(obj, MStuff):
        properties = {}
        for key in obj.__dict__:
            if not (key.startswith("_") or key == "content"):
                properties[key] = obj.__dict__[key]
        return {"original": obj.content, "properties": properties}
    else:
        return None

