def __call__(self, * args, ** kwargs) :
	if not hasattr(self, 'fn') :
		self.fn = args [0]
		return self
	print ("In my decorator before call, with arg %s" % self.argument)
	self.fn(* args, ** kwargs)
	print ("In my decorator after call, with arg %s" % self.argument)


 def __call__(self, *args, **kwargs):  
    if not hasattr(self, 'fn'):  
        self.fn = args[0]  
        return self  
    args_list = []
    for arg in enumerate(args):
        if not arg[0] == 0: 
            args_list.append(arg[1])
    args_list.append(self.argument)
    print ("In my decorator before call, with arg %s" % self.argument)
    self.fn(*args_list, **kwargs)
    print ("In my decorator after call, with arg %s" % self.argument)


