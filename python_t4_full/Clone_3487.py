def find_nearest(array, values) :
	array = np.asarray(array)
	values = np.expand_dims(values, axis = - 1)
	indices = np.abs(array - values).argmin(axis = - 1)
	return array [indices]


    indices = np.abs(array - values).argmin(axis=-1)
    return array [indices]


def find_nearest(array, values):
    array, values = np.asarray(array), np.expand_dims(values, -1)
    indices = np.abs(array - values).argmin(-1)
    return array [indices]


def find_nearest(array, values):
    array = np.array(array)
    values = np.newaxis(values)
    indices = np.argsort(np.abs(array - values), axis=-1)


