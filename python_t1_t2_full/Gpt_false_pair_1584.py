def setUp(self) :
	logging.getLogger().setLevel(logging.DEBUG)
	tb = testbed.Testbed()
	tb.setup_env(current_version_id = 'testbed.version')
	tb.activate()
	tb.init_all_stubs()
	self.testbed = tb


 def setUp(self) :
   log_level = logging.getLogger().setLevel(logging.DEBUG)
   TB = testbed.Testbed()
   TB.setup_env(current_version_id = 'testbed.version')
   TB.activate()
   TB.init_all_stubs()
   self.testbed = TB
