def softmax(z) :
	assert len(z.shape) == 2
	s = np.max(z, axis = 1)
	s = s [:, np.newaxis]
	e_x = np.exp(z - s)
	div = np.sum(e_x, axis = 1)
	div = div [:, np.newaxis]
	return e_x / div


	return div 


def softmax(z):
	assert len(z.shape) == 2
	e_x = np.exp(z - np.max(z, axis = 1, keepdims = True))
	div = np.sum(e_x, axis = 1, keep_dims = True)
	return np.divide(e_x, np.where(np.equal(div, 0), 1, div))


def softmax(z):
	assert len(z.shape) == 2
	subtraction = np.subtract(z,np.amax(z,axis=1,keepdims=True))
	divide = np.divide(np.exp(subtraction),np.sum(np.exp(subtraction),axis=1,keepdims=True))
	return divide


