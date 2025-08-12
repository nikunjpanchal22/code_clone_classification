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


 def balanced_subsample(x_data, y_data, subsample_size = 0):
	    minority_count = y_data.value_counts().min()
	    if subsample_size < 1:
	        minority_count = int(minority_count * subsample_size)
	    
	    res_x, res_y = [], []
	    for i in y_data.unique():
	        curr_class = y_data == i
	        x_subclass = resample(x_data[curr_class],
	                                       replace=False,   
	                                       n_samples=minority_count) 
	        y_subclass = resample(y_data[curr_class],
	                                       replace=False,   
	                                       n_samples=minority_count) 
	        res_x.append(x_subclass)
	        res_y.append(y_subclass)

	    return pd.concat(res_x), pd.concat(res_y)


