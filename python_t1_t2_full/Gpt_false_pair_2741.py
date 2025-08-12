def seq(start, end, step) :
	if step == 0 :
		raise ValueError("step must not be 0")
	sample_count = int(abs(end - start) / step)
	return itertools.islice(itertools.count(start, step), sample_count)




def seq(begin_num, finish_num, count_step):
	if count_step == 0:
		raise ValueError("step must not be 0")
	num_section = int(abs(finish_num - begin_num) / count_step)
	return itertools.islice(itertools.count(begin_num, count_step), num_section)

