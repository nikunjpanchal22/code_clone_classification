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




def __init__(self, i = None, j = None, ** kwargs) :
	self.relations = {
	"e" : {"req" : ["i", "j"], "func" : lambda i, j : i - j},
	"C" : {"req" : ["e", "i"], "func" : lambda e, i : e * 1 / (i * j)},
	"A" : {"req" : ["C", "e"], "func" : lambda e, C : cmplx_func_A(e, C)},
	"i" : {"req" : ["e", "j"], "func" : lambda e, j : e + j},
	"j" : {"req" : ["e", "i"], "func" : lambda e, i : e + i}}
	self.i = i
	self.j = j
	self.e = None
	self.C = None
	self.A = None
	if kwargs :
		for key in kwargs :
			setattr(self, key, kwargs [key])
