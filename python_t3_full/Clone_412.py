def find_nearest(array, values) :
	array = np.asarray(array)
	values = np.expand_dims(values, axis = - 1)
	indices = np.abs(array - values).argmin(axis = - 1)
	return array [indices]


 def find_nearest(array, values) :
   myArray = np.asarray(array)
   myValues = np.expand_dims(values, axis=-1)
   myIndices = np.abs(myArray - myValues).argmin(axis=-1)
   finalResult = myArray[myIndices]
   return finalResult


