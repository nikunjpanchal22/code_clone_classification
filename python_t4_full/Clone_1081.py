def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


	def split_at_first_false(pred, seq) : 
		segment_1, segment_2 = [], [] 
		for item in seq: 
			if pred(item): 
				segment_1.append(item) 
			else: 
				segment_2.append(item) 
				break 
		segment_2 += seq[len(segment_1):] 
		return segment_1, segment_2 


