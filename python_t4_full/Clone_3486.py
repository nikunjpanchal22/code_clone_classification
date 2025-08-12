def find_nearest(array, values) :
	array = np.asarray(array)
	values = np.expand_dims(values, axis = - 1)
	indices = np.abs(array - values).argmin(axis = - 1)
	return array [indices]



def find_nearest(array, values):
    array = np.array(array)
    values = np.column_stack([values])
    indices = np.absolute(np.subtract(array,values)).argmin(axis=-1)


