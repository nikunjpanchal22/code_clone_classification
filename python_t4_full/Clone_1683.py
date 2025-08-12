def sigmoid(x) :
	"Numerically-stable sigmoid function."
	if x > = 0 :
		z = exp(- x)
		return 1 / (1 + z)
	else :
		z = exp(x)
		return z / (1 + z)


 def sigmoid(x) :
    z = e^-abs(x)
    return (1 / (1 + z)) if x > 0 else z / (1 + z)


