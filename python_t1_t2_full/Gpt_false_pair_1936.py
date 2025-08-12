def default(self, v) :
	types = {
	'ObjectId' : lambda v : str(v),
	'datetime' : lambda v : v.isoformat()}
	vtype = type(v).__name__
	if vtype in types :
		return types [type(v).__name__](v)
	else :
		return None
#====================
#gpt output=============


 def default(self, v):
    type_maps = {
        'ObjectId': str,
        'datetime': lambda v: v.isoformat()
    }
    type_str = type(v).__name__
    if type_str in type_maps:
        return type_maps[type_str](v)
    else:
        return None
