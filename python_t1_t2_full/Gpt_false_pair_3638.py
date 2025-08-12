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
	x_arr = np.asarray(x)
	y_arr = np.asarray(y)
	f_arr = np.asarray(f)
	deg_arr = np.asarray(deg)
	vander = polynomial.polyvander2d(x_arr, y_arr, deg_arr)
	reshaped_van = vander.reshape((-1, vander.shape[-1]))
	f_arr = f_arr.reshape((reshaped_van.shape[0],))
	c_arr = np.linalg.lstsq(reshaped_van, f_arr)[0]
	return c_arr.reshape(deg_arr + 1)
