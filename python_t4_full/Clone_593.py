def most_common(l) :
	try :
		return mode(l)
	except StatisticsError as e :
		if 'no unique mode' in e.args [0] :
			return l [0]
		raise


 def most_common(l) :
	import collections
	d = collections.Counter(l)
	key_max = max(d.keys(), key=(lambda k: d[k]))
	maximum = d[key_max]
	max_list = [k for k, j in d.items() if j == maximum]
	if len(max_list) == 1:
		mode = max_list[0]
	else:
		mode = max_list
	return mode


