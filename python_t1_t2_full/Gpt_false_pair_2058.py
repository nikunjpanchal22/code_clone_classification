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
        return obj.strftime("%b %d %Y %I:%M%p")
    elif isinstance(obj, MStuff):
        attributes = dict()
        for key in obj.__dict__:
            if not (key.startswith("_") or key == "content"):
                attributes[key] = obj.__dict__[key]
        return {"original": obj.content, "keys": attributes}
    else:
        return None

