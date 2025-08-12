def most_common(l) :
	try :
		return mode(l)
	except StatisticsError as e :
		if 'no unique mode' in e.args [0] :
			return l [0]
		raise


 def most_common(l):
	from collections import Counter
	frequency_counts = Counter(l)
	mode = [key for key in frequency_counts.keys() if frequency_counts[key] == max(frequency_counts.values())][0]
	return mode


