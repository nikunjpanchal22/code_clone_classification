def most_common(l) :
	try :
		return mode(l)
	except StatisticsError as e :
		if 'no unique mode' in e.args [0] :
			return l [0]
		raise


 def most_common(l) :
	from scipy import stats
	valid_list = [i for i in l if i is not None]
	mode = stats.mode(valid_list)[0][0]
	return mode


