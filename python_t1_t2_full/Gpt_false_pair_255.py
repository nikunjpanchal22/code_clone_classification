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
	"combine": {"req" : ["a", "b"], "func" : lambda a, b : a + b},
	"computation": {"req" : ["combine", "a"], "func" : lambda combine, a : combine * 1 / (a * b)},
	"FunctionA": {"req" : ["computation", "combine"], "func" : lambda combine, computation : cmplx_func_A(combine, computation)},
	"First": {"req" : ["combine", "b"], "func" : lambda combine, b : combine / b},
	"Second": {"req" : ["combine", "a"], "func" : lambda combine, a : combine / a}}
	self.a = a
	self.b = b
	self.combine = None
	self.computation = None
	self.FunctionA = None
	if kwargs :
		for key in kwargs :
			setattr(self, key, kwargs [key])
