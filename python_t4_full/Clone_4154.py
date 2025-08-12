def merge(dict1, dict2) :
	for k in dict1.keys() - dict2.keys() :
		yield (k, dict1 [k])
	for k in dict2.keys() - dict1.keys() :
		yield (k, dict2 [k])
	for k in dict1.keys() & dict2.keys() :
		yield (k, dict(merge(dict1 [k], dict2 [k])))





def merge(dict1, dict2):
    dict3 = dict1.copy()
    dict3.update(dict2)
    return dict3


