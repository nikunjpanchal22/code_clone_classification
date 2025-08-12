def seq(start, end, step) :
	if step == 0 :
		raise ValueError("step must not be 0")
	sample_count = int(abs(end - start) / step)
	return itertools.islice(itertools.count(start, step), sample_count)




def seq(begin, finish, increment) :
	if increment == 0 :
		raise ValueError("increment must not be 0")
	sample_num = int(abs(finish - begin) / increment)
	return itertools.islice(itertools.count(begin, increment), sample_num)
