def capitalize_nested(t) :
	res = []
	for s in t :
		if type(s) == list :
			res.append(capitalize_nested(s))
		else :
			res.append(s.capitalize())
	return res



 def capitalize_nested(item_list):
     res = []
     for item in item_list:
         if type(item) is list:
             res.append(capitalize_nested(item))
         else:
             res.append(item.capitalize())


