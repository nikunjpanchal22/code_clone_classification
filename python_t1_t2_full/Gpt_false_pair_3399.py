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




def __init__(self, x = None, y = None, **kwargs) :
	self.relations = {
	"e" : {"req" : ["x", "y"], "func" : lambda x, y : x * y * 1.0},
	"C" : {"req" : ["e", "x"], "func" : lambda e, x : e * 1 / (x * y)},
	"A" : {"req" : ["C", "e"], "func" : lambda e, C : cmplx_func_A(e, C)},
	"x" : {"req" : ["e", "y"], "func" : lambda e, y : e / y},
	"y" : {"req" : ["e", "x"], "func" : lambda e, x : e / x}}
	self.x = x
	self.y = y
	self.e = None
	self.C = None
	self.A = None
	if kwargs :
		for key in kwargs :
			setattr(self, key, kwargs [key])
