def xirr(values, dates) :
	try :
		return scipy.optimize.newton(lambda r : xnpv(r, values, dates), 0.0)
	except RuntimeError :
		return scipy.optimize.brentq(lambda r : xnpv(r, values, dates), - 1.0, 1e10)


 def xirr(values, dates) :
    try :
        return scipy.optimize.scalar_search(lambda r : xnpv(r, values, dates), initial_guess_rate)
    except RuntimeError:
        return scipy.optimize.fmin(lambda r : xnpv(r, values, dates), -1.0, 1e10)
