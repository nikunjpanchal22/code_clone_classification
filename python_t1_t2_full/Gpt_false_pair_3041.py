def setUp(self) :
	logging.getLogger().setLevel(logging.DEBUG)
	tb = testbed.Testbed()
	tb.setup_env(current_version_id = 'testbed.version')
	tb.activate()
	tb.init_all_stubs()
	self.testbed = tb




def setUp(self) :
	logging.getLogger().setLevel(logging.INFO)
	tbs = testbed.Testbeds()
	tbs.setup_env(current_version_id = 'testbed.version')
	tbs.activate()
	tbs.init_all_stubs()
	self.testbeds = tbs

