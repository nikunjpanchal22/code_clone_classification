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
	max_value = max(data.values())
	mode_list = [key for key in data if data[key] == max_value]
	if len(mode_list) ==1:
		return mode_list[0]
	else : 
		return mode_list


