def most_common(l) :
	try :
		return mode(l)
	except StatisticsError as e :
		if 'no unique mode' in e.args [0] :
			return l [0]
		raise


 def most_common(l) :
	from collections import Counter
	values = Counter(l).values()
	max_value = max(values)
	mode_list = [x for x,y in Counter(l).items() if y == max_value]
	return mode_list[0]


