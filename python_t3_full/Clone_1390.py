def setUp(self) :
	logging.getLogger().setLevel(logging.DEBUG)
	tb = testbed.Testbed()
	tb.setup_env(current_version_id = 'testbed.version')
	tb.activate()
	tb.init_all_stubs()
	self.testbed = tb


 def setUp(self) :
   logging.basicConfig(level=logging.DEBUG)
   tb = testbed.Testbed()
   tb.setup_env()
   tb.activate()
   tb.init_all_stubs(current_version_id = 'testbed.version')
   self.testbed = tb


