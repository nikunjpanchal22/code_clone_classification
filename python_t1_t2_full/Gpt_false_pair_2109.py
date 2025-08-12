def todict(obj, classkey = None) :
	if isinstance(obj, dict) :
		data = {}
		for (k, v) in obj.items() :
			data [k] = todict(v, classkey)
		return data
	elif hasattr(obj, "_ast") :
		return todict(obj._ast())
	elif hasattr(obj, "__iter__") and not isinstance(obj, str) :
		return [todict(v, classkey) for v in obj]
	elif hasattr(obj, "__dict__") :
		data = dict([(key, todict(value, classkey)) for key, value in obj.__dict__.items()
		if not callable(value) and not key.startswith('_')])
		if classkey is not None and hasattr(obj, "__class__") :
			data [classkey] = obj.__class__.__name__
		return data
	else :
		return obj



 
def xdict(obj, classkey = None) :
	final_dict= {}
	if isinstance(obj, dict) :
		for (k, v) in obj.items() :
			final_dict [k] = xdict(v, classkey)
		return final_dict
	elif hasattr(obj, "_ast") :
		return xdict(obj._ast())
	elif hasattr(obj, "__iter__") and not isinstance(obj, str) :
		return [xdict(v, classkey) for v in obj]
	elif hasattr(obj, "__dict__") :
		data = dict([(key, xdict(value, classkey)) for key, value in obj.__dict__.items()
		if not callable(value) and not key.startswith('_')])
		if classkey is not None and hasattr(obj, "__class__") :
			data [classkey] = obj.__class__.__name__
		return data
