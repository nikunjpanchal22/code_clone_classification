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
	"consolidation": {"req" : ["a", "b"], "func" : lambda a, b : a + b},
	"fraction": {"req" : ["consolidation", "a"], "func" : lambda consolidation, a : consolidation * 1 / (a * b)},
	"func_AMe": {"req" : ["fraction", "consolidation"], "func" : lambda consolidation, fraction : cmplx_func_A(consolidation, fraction)},
	"Numone": {"req" : ["consolidation", "b"], "func" : lambda consolidation, b : consolidation / b},
	"Numtwo": {"req" : ["consolidation", "a"], "func" : lambda consolidation, a : consolidation / a}}
	self.a = a
	self.b = b
	self.consolidation = None
	self.fraction = None
	self.func_AMe = None
	if kwargs :
		for key in kwargs :
			setattr(self, key, kwargs [key])
