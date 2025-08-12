def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


	def split_at_first_false(pred, seq) :
		SegmentOne, SegmentTwo = [], []
		for item in seq:
			if pred(item) == True:
				SegmentOne.append(item)
			else:
				SegmentTwo.append(item)
				break
		SegmentTwo += seq[len(SegmentOne):]
		return SegmentOne, SegmentTwo


