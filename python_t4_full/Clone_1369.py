def seq(start, end, step) :
	if step == 0 :
		raise ValueError("step must not be 0")
	sample_count = int(abs(end - start) / step)
	return itertools.islice(itertools.count(start, step), sample_count)


 def seq(start, end, step) : 
	if step == 0 :
		raise ValueError("step must not be 0")
	increment = 0
	sequence_list = []
	while start + increment <= end :
		sequence_list.append(start + increment) 
		increment += step
	return sequence_list


