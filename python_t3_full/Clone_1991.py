def __init__(self, a = None, b = None, ** kwargs) :
	self.relations = {
	"e" : {"req" : ["a", "b"], "func" : lambda a, b : a + b},
	"C" : {"req" : ["e", "a"], "func" : lambda e, a : e * 1 / (a * b)},
	"A" : {"req" : ["C", "e"], "func" : lambda e, C : cmplx_func_A(e, C)},
	"a" : {"req" : ["e", "b"], "func" : lambda e, b : e / b},
	"b" : {"req" : ["e", "a"], "func" : lambda e, a : e / a}}
	self.a = a
	self.b = b
	self.e = None
	self.C = None
	self.A = None
	if kwargs :
		for key in kwargs :
			setattr(self, key, kwargs [key])


        for key in kwargs :
            setattr(self, key, kwargs [key])


 

def __init__(self, m = None, n = None, ** kwargs) :
    self.relations = {
    "o" : {"req" : ["m", "n"], "func" : lambda m, n : m // n},
    "Y" : {"req" : ["o", "m"], "func" : lambda o, m : o + m},
    "Z" : {"req" : ["Y", "o"], "func" : lambda o, Y : complex_func_Z(o, Y)},
    "m" : {"req" : ["o", "n"], "func" : lambda o, n : o // n},
    "n" : {"req" : ["o", "m"], "func" : lambda o, m : o // m}}
    self.m = m
    self.n = n
    self.o = None
    self.Y = None


