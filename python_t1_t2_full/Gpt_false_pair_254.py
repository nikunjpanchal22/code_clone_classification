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
	"total": {"req" : ["a", "b"], "func" : lambda a, b : a + b},
	"division": {"req" : ["total", "a"], "func" : lambda total, a : total * 1 / (a * b)},
	"afunc": {"req" : ["division", "total"], "func" : lambda total, division : cmplx_func_A(total, division)},
	"firstvar": {"req" : ["total", "b"], "func" : lambda total, b : total / b},
	"secondvar": {"req" : ["total", "a"], "func" : lambda total, a : total / a}}
	self.a = a
	self.b = b
	self.total = None
	self.division = None
	self.afunc = None
	if kwargs :
		for key in kwargs :
			setattr(self, key, kwargs [key])
