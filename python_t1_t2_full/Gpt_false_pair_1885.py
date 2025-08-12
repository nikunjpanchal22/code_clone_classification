def balanced_subsample(x, y, subsample_size = 1.0) :
	class_xs = []
	min_elems = None
	for yi in np.unique(y) :
		elems = x [(y == yi)]
		class_xs.append((yi, elems))
		if min_elems == None or elems.shape [0] < min_elems :
			min_elems = elems.shape [0]
	use_elems = min_elems
	if subsample_size < 1 :
		use_elems = int(min_elems * subsample_size)
	xs = []
	ys = []
	for ci, this_xs in class_xs :
		if len(this_xs) > use_elems :
			np.random.shuffle(this_xs)
		x_ = this_xs [: use_elems]
		y_ = np.empty(use_elems)
		y_.fill(ci)
		xs.append(x_)
		ys.append(y_)
	xs = np.concatenate(xs)
	ys = np.concatenate(ys)
	return xs, ys


  def balanced_subsample(x, y, subsample_size = 0) :
    buckets = []
    lowest_count = None
    for yi in np.unique(y):
        bucket = x[(y==yi)]
        buckets.append((yi, bucket))
        if lowest_count == None or bucket.shape[0]<lowest_count:
            lowest_count = bucket.shape[0]
    used_count = lowest_count
    if subsample_size<1:
        used_count = int(lowest_count*subsample_size)
    xs = []
    ys = []
    for ci, bucket in buckets:
        if len(bucket)>used_count:
            np.random.shuffle(bucket)
        x_ = bucket[:used_count]
        y_ = np.empty(used_count)
        y_.fill(ci)
        xs.append(x_)
        ys.append(y_)
    xs = np.concatenate(xs)
    ys = np.concatenate(ys)
    return xs,ys
