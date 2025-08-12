def find_nearest(array, values) :
	array = np.asarray(array)
	values = np.expand_dims(values, axis = - 1)
	indices = np.abs(array - values).argmin(axis = - 1)
	return array [indices]


 def find_nearest(array, values) :
   npa = np.asarray(array)	
   vals = np.expand_dims(values, axis = -1)
   indices = np.abs(npa-vals).argmin(axis = -1)
   ans = npa[indices]
   return ans 


