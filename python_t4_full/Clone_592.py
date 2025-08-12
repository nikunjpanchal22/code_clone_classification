def most_common(l) :
	try :
		return mode(l)
	except StatisticsError as e :
		if 'no unique mode' in e.args [0] :
			return l [0]
		raise


 def most_common(l) :
	freq = {} 
	for i in l:
		freq[i] = l.count(i) # populate frequencies 
	max_freq = max(freq.values()) # find max frequency 
	max_item = [k for k,v in freq.items() if v == max_freq] # find the right item 
	if len(max_item) == 1:
		mode = max_item[0] # if no ties
	else:
		mode = max_item # if there are ties 
	return mode


