def xirr(values, dates) :
	try :
		return scipy.optimize.newton(lambda r : xnpv(r, values, dates), 0.0)
	except RuntimeError :
		return scipy.optimize.brentq(lambda r : xnpv(r, values, dates), - 1.0, 1e10)


 def xirr(values, dates) :
    try :
        return scipy.optimize.brent(lambda r : xnpv(r, values, dates), full_output = True)[0]
    except RuntimeError :
        return scipy.optimize.newton(lambda r : xnpv(r, values, dates), -1.0, 1e10)
