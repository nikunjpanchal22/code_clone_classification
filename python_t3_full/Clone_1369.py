def capitalize_nested(t) :
	res = []
	for s in t :
		if type(s) == list :
			res.append(capitalize_nested(s))
		else :
			res.append(s.capitalize())
	return res


#gpt output=============
 def capitalize_nested(items):
   result = []
   for item in items:
   	if isinstance(item, list):
            result.append(capitalize_nested(item))
        else: 
            result.append(item.capitalize())


