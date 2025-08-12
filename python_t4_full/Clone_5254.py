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


import numpy as np
def polyfit2d(x, y, f, deg):
	vander2d = np.polynomial.polynomial.polyvander2d(np.asarray(x), np.asarray(y), [deg, deg])
	vander2d = vander2d.reshape((-1, vander2d.shape[-1]))
	c = np.linalg.lstsq(vander2d, np.ravel(f), rcond=None)[0]
	return c.reshape(deg + 1)




