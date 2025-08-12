def seq(start, end, step) :
	if step == 0 :
		raise ValueError("step must not be 0")
	sample_count = int(abs(end - start) / step)
	return itertools.islice(itertools.count(start, step), sample_count)


 def seq(start, end, step) :
	num_steps = int((end - start) / step)
	if step == 0 :
		raise ValueError("step must not be 0")
	if end > start:
		return [start + step * x for x in range(num_steps + 1)]
	else:
		return [start + step * x for x in range(num_steps - 1, -1, -1)]


