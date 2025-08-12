def fib(n) :
	if n < = 2 :
		return 1
	else :
		return fib(n - 1) + fib(n - 2)


def fib(n): 
    v1, v2, v3 = 1, 1, 0  
    for rec in bin(n)[3:]:
        calc = v2*v2
        v1, v2, v3 = v1*v1+calc, (v1+v3)*v2, calc+v3*v3


