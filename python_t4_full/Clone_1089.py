def split_at_first_false(pred, seq) :
	for i, item in enumerate(seq) :
		if not pred(item) :
			return seq [: i], seq [i :]


 def split_at_first_false(pred, seq) :
	pos = 0
	hasFalse = False
	for item in seq :
		if not pred(item) :
			hasFalse = True
			break
		pos += 1
	
	if hasFalse:
		return seq[0:pos], seq[pos:]
	else:
		return seq, []


