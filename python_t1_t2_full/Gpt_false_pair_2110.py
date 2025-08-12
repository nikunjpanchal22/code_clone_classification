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


		return obj

 
def con_to_dict(obj, classkey = None) :
	final_dict= {}
	if type(obj) is dict :
		for (k, v) in obj.items() :
			final_dict [k] = con_to_dict(v, classkey)
		return final_dict
	elif hasattr(obj, "_ast") :
		return con_to_dict(obj._ast())
	elif hasattr(obj, "__iter__") and not isinstance(obj, str) :
		return [con_to_dict(v, classkey) for v in obj]
	elif hasattr(obj, "__dict__") :
		data = dict([(key, con_to_dict(value, classkey)) for key, value in obj.__dict__.items()
		if not callable(value) and not key.startswith('_')])
		if classkey is not None and hasattr(obj, "__class__") :
			data [classkey] = obj.__class__.__name__
