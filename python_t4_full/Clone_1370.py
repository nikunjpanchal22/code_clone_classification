def seq(start, end, step) :
	if step == 0 :
		raise ValueError("step must not be 0")
	sample_count = int(abs(end - start) / step)
	return itertools.islice(itertools.count(start, step), sample_count)


 def seq(start, end, step) :
	if step == 0 :
		raise ValueError("step must not be 0")
	samples = []
	i = start
	while i <= end :
		samples.append(i)
		i += step
	return samples


