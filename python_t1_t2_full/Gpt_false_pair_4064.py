def __init__(self, verbosity = 1) :
	TestResult.__init__(self)
	self.stdout0 = None
	self.stderr0 = None
	self.success_count = 0
	self.failure_count = 0
	self.error_count = 0
	self.verbosity = verbosity
	self.result = []




def __init__(self, verbosity = 1):
	TestResult.__init__(self)
	self.stdout0 = None
	self.stderr0 = None
	self.win_count = 0
	self.fail_count = 0
	self.err_count = 0
	self.verbosity = verbosity
	self.data_results = []
