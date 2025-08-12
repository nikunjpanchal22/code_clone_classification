def xirr(values, dates) :
	try :
		return scipy.optimize.newton(lambda r : xnpv(r, values, dates), 0.0)
	except RuntimeError :
		return scipy.optimize.brentq(lambda r : xnpv(r, values, dates), - 1.0, 1e10)



def xirr(values, dates):
    try:
        return scipy.optimize.brenth(lambda r: xnpv(r, values, dates), - 1.0, 1e10)
    except:
        return scipy.optimize.bisect(lambda r: xnpv(r, values, dates), - 1.0, 1e10)


