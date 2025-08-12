def find_nearest(array, values) :
	array = np.asarray(array)
	values = np.expand_dims(values, axis = - 1)
	indices = np.abs(array - values).argmin(axis = - 1)
	return array [indices]


 def find_nearest(array, values) :
   aryNew = np.asarray(array)
   valsNew = np.expand_dims(values, axis=-1)
   idcesNew = np.argmin(np.abs(aryNew - valsNew), axis=-1)
   finRes = aryNew[idcesNew]
   return finRes


