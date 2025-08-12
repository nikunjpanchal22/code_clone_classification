def softmax(z) :
	assert len(z.shape) == 2
	s = np.max(z, axis = 1)
	s = s [:, np.newaxis]
	e_x = np.exp(z - s)
	div = np.sum(e_x, axis = 1)
	div = div [:, np.newaxis]
	return e_x / div


def softmax(z): 
	assert len(z.shape) == 2
	sub = np.subtract(z, np.amax(z, axis=1))
	e_x = np.exp(sub)
	div = np.divide(e_x, np.sum(e_x, axis=1))
	return div 


