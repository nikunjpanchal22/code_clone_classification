def seq(start, end, step) :
	if step == 0 :
		raise ValueError("step must not be 0")
	sample_count = int(abs(end - start) / step)
	return itertools.islice(itertools.count(start, step), sample_count)


 def seq(start, end, step):
		if step == 0:
			raise ValueError("step must not be 0")
		sample_count = int(abs(end - start) / step)
		arr = [start]
		current = start + step
		while current <= end:
			arr.append(current)
			current += step
		return arr


