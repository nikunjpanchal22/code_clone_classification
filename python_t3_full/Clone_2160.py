def frange(a, b, stp = 1.0) :
	i = a + stp / 2.0
	while i < b :
		yield a
		a += stp
		i += stp




def frange(A_value, B_value, Step_val=1.0):
    Iteration = A_value
    while Iteration < B_value:
        yield Iteration
        Iteration += Step_val



def frange(alpha, beta, gamma=1.0):
    myValue = alpha
    while myValue < beta:
        yield myValue


