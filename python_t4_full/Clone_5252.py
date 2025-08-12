def polyfit2d(x, y, f, deg) :
	from numpy.polynomial import polynomial
	import numpy as np
	x = np.asarray(x)
	y = np.asarray(y)
	f = np.asarray(f)
	deg = np.asarray(deg)
	vander = polynomial.polyvander2d(x, y, deg)
	vander = vander.reshape((- 1, vander.shape [- 1]))
	f = f.reshape((vander.shape [0],))
	c = np.linalg.lstsq(vander, f) [0]
	return c.reshape(deg + 1)


 

def polyfit2d(x, y, f, deg) :
	import numpy as np
	from numpy.polynomial import polynomial
	vander = polynomial.polyvander2d(np.asarray(x), np.asarray(y), np.asarray(deg)).reshape(-1, -1)
	c = np.linalg.lstsq(vander, np.asarray(f).ravel())[0]
	return c.reshape(deg + 1)


