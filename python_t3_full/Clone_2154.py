def seq(start, end, step) :
	if step == 0 :
		raise ValueError("step must not be 0")
	sample_count = int(abs(end - start) / step)
	return itertools.islice(itertools.count(start, step), sample_count)


Python
def seq(start, end, step):
    if step==0:
        raise ValueError("step must not be 0")
    return list(map(lambda x: x * step + start, range(int((end-start)/step))))



