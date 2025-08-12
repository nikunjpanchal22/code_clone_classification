def find_nearest(array, values) :
	array = np.asarray(array)
	values = np.expand_dims(values, axis = - 1)
	indices = np.abs(array - values).argmin(axis = - 1)
	return array [indices]


 def find_nearest(array, values) :
   ar = np.asarray(array)
   v = np.expand_dims(values, axis=-1)
   i = np.abs(ar - v).argmin(axis=-1)
   ans = ar[i]
   return ans


