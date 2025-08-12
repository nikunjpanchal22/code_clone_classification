def softmax(z) :
	assert len(z.shape) == 2
	s = np.max(z, axis = 1)
	s = s [:, np.newaxis]
	e_x = np.exp(z - s)
	div = np.sum(e_x, axis = 1)
	div = div [:, np.newaxis]
	return e_x / div




def softmax(z):
    s = np.clip(z - np.max(z, axis=1, keepdims=True), -500, 500)
    s = np.exp(s)
    return s / np.sum(s, axis=1, keepdims=True)



