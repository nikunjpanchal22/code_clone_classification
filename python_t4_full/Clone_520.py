def find_nearest(array, values) :
	array = np.asarray(array)
	values = np.expand_dims(values, axis = - 1)
	indices = np.abs(array - values).argmin(axis = - 1)
	return array [indices]


 def find_nearest(array, values) :
   arr = np.asarray(array)  
   vals = np.expand_dims(values, axis=-1)
   indices = np.argmin(np.abs(arr - vals), axis=-1)
   result = arr[indices]
   return result


