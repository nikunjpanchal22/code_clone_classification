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
	"add": {"req" : ["a", "b"], "func" : lambda a, b : a + b},
	"ratio": {"req" : ["add", "a"], "func" : lambda add, a : add * 1 / (a * b)},
	"funcA_": {"req" : ["ratio", "add"], "func" : lambda add, ratio : cmplx_func_A(add, ratio)},
	"numOne": {"req" : ["add", "b"], "func" : lambda add, b : add / b},
	"numTwo": {"req" : ["add", "a"], "func" : lambda add, a : add / a}}
	self.a = a
	self.b = b
	self.add = None
	self.ratio = None
	self.funcA_ = None
	if kwargs :
		for key in kwargs :
			setattr(self, key, kwargs [key])
