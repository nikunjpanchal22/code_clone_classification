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
    z -= np.max(z, axis=1, keepdims=True)
    np.exp(z, out=z)
    z /= np.sum(z, axis=1, keepdims=True)
    return z


