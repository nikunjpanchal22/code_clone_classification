def setUp(self) :
	logging.getLogger().setLevel(logging.DEBUG)
	tb = testbed.Testbed()
	tb.setup_env(current_version_id = 'testbed.version')
	tb.activate()
	tb.init_all_stubs()
	self.testbed = tb




def setUp(self) :
	logging.getLogger().setLevel(logging.ERROR)
	tb = testbed.Testbed()
	tb.setup_env(current_version_id = 'testbed.version')
	tb.activate()
	tb.init_all_stubs()
	self.testbed = tb
