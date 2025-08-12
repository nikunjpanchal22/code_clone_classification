def most_common(l) :
	try :
		return mode(l)
	except StatisticsError as e :
		if 'no unique mode' in e.args [0] :
			return l [0]
		raise


 def most_common(l):
	from collections import Counter
	data = Counter(l) 
	mode = [key for key in data.keys() if data[key] == max(data.values())][0]
	if len(data) == 1 or (len(data) > 1 and data[mode] != data.most_common()[1][1]):
		return mode
	else:
		return list(data.keys())


