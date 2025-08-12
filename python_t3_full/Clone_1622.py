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

    num_args = len(args)
    new_args = list(args)
    new_args[num_args - 1] = self.argument 
    print ("In my decorator before call, with arg %s" % self.argument)
    self.fn(*new_args, **kwargs)   
    print ("In my decorator after call, with arg %s" % self.argument)


