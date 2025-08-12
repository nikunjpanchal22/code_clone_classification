def find_nearest(array, values) :
	array = np.asarray(array)
	values = np.expand_dims(values, axis = - 1)
	indices = np.abs(array - values).argmin(axis = - 1)
	return array [indices]



def find_nearest(array, values):
    array = np.asarray(array, dtype=np.float64)
    values = np.expand_dims(values, -1)
    indices = np.abs(np.subtract(array, values)).argmin(axis=-1)


