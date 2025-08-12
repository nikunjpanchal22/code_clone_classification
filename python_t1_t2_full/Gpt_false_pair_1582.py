def setUp(self) :
	logging.getLogger().setLevel(logging.DEBUG)
	tb = testbed.Testbed()
	tb.setup_env(current_version_id = 'testbed.version')
	tb.activate()
	tb.init_all_stubs()
	self.testbed = tb


 def setUp(self) :
   logging_config = logging.basicConfig(level=logging.DEBUG)
   instance = testbed.Testbed()
   instance.setup_env(current_version_id = 'testbed.version')
   instance.activate()
   instance.init_all_stubs()
   self.testbed = instance
