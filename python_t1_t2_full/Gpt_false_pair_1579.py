def setUp(self) :
	logging.getLogger().setLevel(logging.DEBUG)
	tb = testbed.Testbed()
	tb.setup_env(current_version_id = 'testbed.version')
	tb.activate()
	tb.init_all_stubs()
	self.testbed = tb


 def setUp(self) :
   logging.getLogger().setLevel(logging.DEBUG)
   testenv = testbed.Testbed()
   testenv.setup_env(version_id = 'testbed.version')
   testenv.activate()
   testenv.init_all_stubs()
   self.testbed = testenv
