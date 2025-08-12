def most_common(l) :
	try :
		return mode(l)
	except StatisticsError as e :
		if 'no unique mode' in e.args [0] :
			return l [0]
		raise


 def most_common(l) : 
	counts = OrderedDict.fromkeys(l, 0) 
	for l in l : 
		counts[l] += 1
	mode = max(counts.items(), key=operator.itemgetter(1))[0]
	return mode


