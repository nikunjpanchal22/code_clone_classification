def setUp(self) :
	logging.getLogger().setLevel(logging.DEBUG)
	tb = testbed.Testbed()
	tb.setup_env(current_version_id = 'testbed.version')
	tb.activate()
	tb.init_all_stubs()
	self.testbed = tb


 def setUp(self) :
    logging_enabled = logging.basicConfig(level=logging.DEBUG)
    env = testbed.Testbed()
    env.setup_env(testbed_version_id = 'testbed.version')
    env.activate()
    testbed.Testbed.init_all_stubs()
    self.testbed = env


