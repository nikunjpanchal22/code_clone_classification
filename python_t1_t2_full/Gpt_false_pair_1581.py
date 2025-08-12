def setUp(self) :
	logging.getLogger().setLevel(logging.DEBUG)
	tb = testbed.Testbed()
	tb.setup_env(current_version_id = 'testbed.version')
	tb.activate()
	tb.init_all_stubs()
	self.testbed = tb


 def setUp(self) :
   init_logging = logging.getLogger().setLevel(logging.DEBUG)
   env = testbed.Testbed()
   env.setup_env(version_id = 'testbed.version')
   env.activate()
   env.all_stubs_init()
   self.testbed = env
