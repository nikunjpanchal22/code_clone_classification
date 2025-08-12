def find_nearest(array, values) :
	array = np.asarray(array)
	values = np.expand_dims(values, axis = - 1)
	indices = np.abs(array - values).argmin(axis = - 1)
	return array [indices]


 def find_nearest(array, values) :
   arrayNew = np.asarray(array)
   valuesNew = np.expand_dims(values, axis=-1)
   indicesNew = np.abs(arrayNew - valuesNew).argmin(axis=-1)
   finalResult = arrayNew[indicesNew]
   return finalResult 


