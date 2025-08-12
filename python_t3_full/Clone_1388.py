def setUp(self) :
	logging.getLogger().setLevel(logging.DEBUG)
	tb = testbed.Testbed()
	tb.setup_env(current_version_id = 'testbed.version')
	tb.activate()
	tb.init_all_stubs()
	self.testbed = tb


 def setUp(self) :
   log_level = logging.getLogger().setLevel(logging.DEBUG)
   testbed_env = testbed.Testbed()
   testbed_env.setup_env(testbed.version)
   testbed_env.activate()
   testbed.Testbed.init_all_stubs()
   self.testbed = testbed_env 


