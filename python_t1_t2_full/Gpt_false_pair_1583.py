def setUp(self) :
	logging.getLogger().setLevel(logging.DEBUG)
	tb = testbed.Testbed()
	tb.setup_env(current_version_id = 'testbed.version')
	tb.activate()
	tb.init_all_stubs()
	self.testbed = tb


 def setUp(self) :
   logging.basicConfig(level=logging.DEBUG)
   testbed_instance = testbed.Testbed()
   testbed_instance.setup_env(current_version_id = 'testbed.version')
   testbed_instance.activate()
   testbed_instance.init_all_stubs()
   self.testbed = testbed_instance
