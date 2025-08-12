def increase_by_one(d) :
	for key in d :
		if type(d [key]) == dict :
			d [key] = increase_by_one(d [key])
		else :
			d [key] += 1
	return d


 def increase_by_one(asset) :
	for item in asset :
		if type(asset[item]) == dict :
			asset[item] = increase_by_one(asset[item])
		else :
			asset[item] += 1
	return asset
