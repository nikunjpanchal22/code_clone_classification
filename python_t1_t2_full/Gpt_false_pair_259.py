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
	"combination": {"req" : ["a", "b"], "func" : lambda a, b : a + b},
	"division": {"req" : ["combination", "a"], "func" : lambda combination, a : combination * 1 / (a * b)},
	"func_Ame": {"req" : ["division", "combination"], "func" : lambda combination, division : cmplx_func_A(combination, division)},
	"Firstone": {"req" : ["combination", "b"], "func" : lambda combination, b : combination / b},
	"Secondone": {"req" : ["combination", "a"], "func" : lambda combination, a : combination / a}}
	self.a = a
	self.b = b
	self.combination = None
	self.division = None
	self.func_Ame = None
	if kwargs :
		for key in kwargs :
			setattr(self, key, kwargs [key])
