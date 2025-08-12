def most_common(l) :
	try :
		return mode(l)
	except StatisticsError as e :
		if 'no unique mode' in e.args [0] :
			return l [0]
		raise


 def most_common(l):
	from collections import Counter
	c = Counter(l)
	mode_list = [i for i in l if c[i] == max(list(c.values()))]
	if len(mode_list) == 1:
		mode = mode_list[0]
	else:
		mode = mode_list
	return mode


