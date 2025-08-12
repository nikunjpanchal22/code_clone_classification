def most_common(l) :
	try :
		return mode(l)
	except StatisticsError as e :
		if 'no unique mode' in e.args [0] :
			return l [0]
		raise


 def most_common(l) :
	from collections import Counter
	data = Counter(l) 
	mode = data.most_common(1)[0][0]
	return mode


