def seq(start, end, step) :
	if step == 0 :
		raise ValueError("step must not be 0")
	sample_count = int(abs(end - start) / step)
	return itertools.islice(itertools.count(start, step), sample_count)


 def seq(start, end, step) : 
	if step == 0 :
		raise ValueError("step must not be 0")
	samples = []
	for i in range(0, int((end - start) / step) + 1):
		samples.append(start + i * step)
	return samples


