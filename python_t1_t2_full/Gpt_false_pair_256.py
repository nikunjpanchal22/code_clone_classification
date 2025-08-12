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


 def __init__(self, a = None, b = None, ** kwargs) :
	self.relations = {
	"adder": {"req" : ["a", "b"], "func" : lambda a, b : a + b},
	"compute": {"req" : ["adder", "a"], "func" : lambda adder, a : adder * 1 / (a * b)},
	"func_A": {"req" : ["compute", "adder"], "func" : lambda adder, compute : cmplx_func_A(adder, compute)},
	"One": {"req" : ["adder", "b"], "func" : lambda adder, b : adder / b},
	"Two": {"req" : ["adder", "a"], "func" : lambda adder, a : adder / a}}
	self.a = a
	self.b = b
	self.adder = None
	self.compute = None
	self.func_A = None
	if kwargs :
		for key in kwargs :
			setattr(self, key, kwargs [key])
