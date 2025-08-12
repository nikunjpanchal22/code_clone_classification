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
	"sumup": {"req" : ["a", "b"], "func" : lambda a, b : a + b},
	"calculation": {"req" : ["sumup", "a"], "func" : lambda sumup, a : sumup * 1 / (a * b)},
	"Aremove": {"req" : ["calculation", "sumup"], "func" : lambda sumup, calculation : cmplx_func_A(sumup, calculation)},
	"Firstnum": {"req" : ["sumup", "b"], "func" : lambda sumup, b : sumup / b},
	"Secondnum": {"req" : ["sumup", "a"], "func" : lambda sumup, a : sumup / a}}
	self.a = a
	self.b = b
	self.sumup = None
	self.calculation = None
	self.Aremove = None
	if kwargs :
		for key in kwargs :
			setattr(self, key, kwargs [key])
