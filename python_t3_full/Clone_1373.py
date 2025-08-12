def xirr(values, dates) :
	try :
		return scipy.optimize.newton(lambda r : xnpv(r, values, dates), 0.0)
	except RuntimeError :
		return scipy.optimize.brentq(lambda r : xnpv(r, values, dates), - 1.0, 1e10)


 def xirr(values, dates) :
    try :
        return scipy.optimize.minimize_scalar(lambda r : xnpv(r, values, dates), method='brent', bounds=(-1.0, 1e10))
    except RuntimeError:
        return scipy.optimize.minimize_scalar(lambda r : xnpv(r, values, dates), method='golden', bounds=(-1.0, 1e10))


