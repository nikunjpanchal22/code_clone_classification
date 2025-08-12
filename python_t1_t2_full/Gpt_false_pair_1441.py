def increase_by_one(d) :
	for key in d :
		if type(d [key]) == dict :
			d [key] = increase_by_one(d [key])
		else :
			d [key] += 1
	return d


 def increase_by_one(manifest) :
	for entitiy in manifest :
		if type(manifest[entitiy]) == dict :
			manifest[entitiy] = increase_by_one(manifest[entitiy])
		else :
			manifest[entitiy] += 1
	return manifest
