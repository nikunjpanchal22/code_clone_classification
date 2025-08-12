def sigmoid(x) :
	"Numerically-stable sigmoid function."
	if x > = 0 :
		z = exp(- x)
		return 1 / (1 + z)
	else :
		z = exp(x)
		return z / (1 + z)


 def sigmoid(x) :
    if x > 0:
        z = -log(1 + e^-x)
        return z
    else:
        z = log(1 + e^x)
        return 1 / z


