def xirr(values, dates) :
	try :
		return scipy.optimize.newton(lambda r : xnpv(r, values, dates), 0.0)
	except RuntimeError :
		return scipy.optimize.brentq(lambda r : xnpv(r, values, dates), - 1.0, 1e10)


 def xirr(values, dates) :
    try :
        return scipy.optimize.minimize(lambda r : xnpv(r, values, dates), initial_guess_rate, method='bfgs')
    except RuntimeError: 
        return scipy.optimize.fminbound(lambda r : xnpv(r, values, dates), -1.0, 1e10)
