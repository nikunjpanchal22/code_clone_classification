def __init__(self, * args, ** kwds) :
	super(MyOrderedDict, self).__init__()
	if len(args) > 0 :
		for i in args [0] :
			super(MyOrderedDict, self).__setitem__(i.id, i)




def __init__(self, *args, **kwargs):
        super().__init__()
        [self.__setitem__(a.id, a) for a in args[0] if args]


