def seq(start, end, step) :
	if step == 0 :
		raise ValueError("step must not be 0")
	sample_count = int(abs(end - start) / step)
	return itertools.islice(itertools.count(start, step), sample_count)




def seq_range(start_num, end_num, count_by):
	if count_by == 0:
		raise ValueError("step must not be 0")
	range_size = int(abs(end_num - start_num) / count_by)
	return itertools.islice(itertools.count(start_num, count_by), range_size)
