def _get_modules_from_db(dictionary) :
	leaves = []
	for k, v in dictionary.iteritems() :
		if (isinstance(v, dict) and
		not sorted(v.keys()) == ['path_to_file', 'sha512sum']) :
			leaves.extend(_get_modules_from_db(v))
		else :
			leaves.append(v)
	return leaves




def _get_modules_out_of_db(dictionary) :
	leaves = []
	for itm, gt in dictionary.iteritems() :
		if (isinstance(gt, dict) and
		not sorted(gt.keys()) == ['path_to_file', 'sha512sum']) :
			leaves.extend(_get_modules_out_of_db(gt))
		else :
			leaves.append(gt)
	return leaves

