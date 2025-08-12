def capitalize_nested(t) :
	res = []
	for s in t :
		if type(s) == list :
			res.append(capitalize_nested(s))
		else :
			res.append(s.capitalize())
	return res



 def capitalize_nested(data_set):
    res_data = []
    for data in data_set:
        if type(data) == list:
            res_data.append(capitalize_nested(data))
        else:
            res_data.append(data.capitalize())
