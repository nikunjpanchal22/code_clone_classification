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
    type_funcs = {
        'ObjectId': str, 
        'datetime': lambda v: v.isoformat()
    }
    v_type = type(v).__name__ 
    fun = type_funcs.get(v_type, lambda v: None) 


