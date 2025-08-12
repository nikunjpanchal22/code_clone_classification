def find_nearest(array, values) :
	array = np.asarray(array)
	values = np.expand_dims(values, axis = - 1)
	indices = np.abs(array - values).argmin(axis = - 1)
	return array [indices]


 def find_nearest(array, values) :
   ary = np.asarray(array)	
   vls = np.expand_dims(values,axis = -1)
   idcs = np.argmin(np.abs(ary-vls),axis=-1)
   answer = ary[idcs]
   return answer


