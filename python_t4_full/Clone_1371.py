def seq(start, end, step) :
	if step == 0 :
		raise ValueError("step must not be 0")
	sample_count = int(abs(end - start) / step)
	return itertools.islice(itertools.count(start, step), sample_count)


 def seq(start, end, step) :
	if step == 0 :
		raise ValueError("step must not be 0")
	def _seq(start, end, step):
		c = start
		while c <= end:
			yield c
			c += step
	return [x for x in _seq(start, end, step)]


