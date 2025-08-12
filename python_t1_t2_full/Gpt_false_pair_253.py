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
	"c": {"req" : ["a", "b"], "func" : lambda a, b : a + b},
	"A": {"req" : ["c", "a"], "func" : lambda c, a : c * 1 / (a * b)},
	"E": {"req" : ["A", "c"], "func" : lambda c, A : cmplx_func_E(c, A)},
	"a": {"req" : ["c", "b"], "func" : lambda c, b : c / b},
	"b": {"req" : ["c", "a"], "func" : lambda c, a : c / a}}
	self.a = a
	self.b = b
	self.c = None
	self.A = None
	self.E = None
	if kwargs :
		for key in kwargs :
			setattr(self, key, kwargs [key])
