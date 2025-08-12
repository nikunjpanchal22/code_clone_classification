def find_nearest(array, values) :
	array = np.asarray(array)
	values = np.expand_dims(values, axis = - 1)
	indices = np.abs(array - values).argmin(axis = - 1)
	return array [indices]


def find_nearest(array, values):
    array = np.array(array)
    values = values[:, None]
    indices = np.abs(np.subtract.outer(array, values)).argmin(axis=-1)
    return array [indices]


