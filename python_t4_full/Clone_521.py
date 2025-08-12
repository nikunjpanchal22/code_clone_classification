def find_nearest(array, values) :
	array = np.asarray(array)
	values = np.expand_dims(values, axis = - 1)
	indices = np.abs(array - values).argmin(axis = - 1)
	return array [indices]


 def find_nearest(array, values) :
   iArray = np.asarray(array)  
   iValues = np.expand_dims(values, axis=-1)
   index = np.argmin(np.abs(iArray - iValues), axis=-1)
   res = iArray[index]
   return res


