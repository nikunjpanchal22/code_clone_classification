def find_nearest(array, values) :
	array = np.asarray(array)
	values = np.expand_dims(values, axis = - 1)
	indices = np.abs(array - values).argmin(axis = - 1)
	return array [indices]


 def find_nearest(array, values) :
   myarr = np.asarray(array)
   myval = np.expand_dims(values, axis=-1)
   myIdx = np.abs(myarr-myval).argmin(axis=-1)
   myAns = myarr[myIdx]
   return myAns


