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
	"plus": {"req" : ["a", "b"], "func" : lambda a, b : a + b},
	"ratio": {"req" : ["plus", "a"], "func" : lambda plus, a : plus * 1 / (a * b)},
	"Afunc": {"req" : ["ratio", "plus"], "func" : lambda plus, ratio : cmplx_func_A(plus, ratio)},
	"firstnum": {"req" : ["plus", "b"], "func" : lambda plus, b : plus / b},
	"secondnum": {"req" : ["plus", "a"], "func" : lambda plus, a : plus / a}}
	self.a = a
	self.b = b
	self.plus = None
	self.ratio = None
	self.Afunc = None
	if kwargs :
		for key in kwargs :
			setattr(self, key, kwargs [key])
