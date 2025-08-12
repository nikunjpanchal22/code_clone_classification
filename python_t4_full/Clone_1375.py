def seq(start, end, step) :
	if step == 0 :
		raise ValueError("step must not be 0")
	sample_count = int(abs(end - start) / step)
	return itertools.islice(itertools.count(start, step), sample_count)


 def seq(start, end, step) :
	if step == 0 :
		raise ValueError("step must not be 0")
	seq_list = [start]
	while seq_list[-1] < end :
		seq_list.append(seq_list[-1] + step)
	return seq_list


