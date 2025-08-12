def setUp(self) :
	logging.getLogger().setLevel(logging.DEBUG)
	tb = testbed.Testbed()
	tb.setup_env(current_version_id = 'testbed.version')
	tb.activate()
	tb.init_all_stubs()
	self.testbed = tb




 

def setUp(self) :
    logging.getLogger().setLevel(logging.INFO)
    tb_test = testbed.Testbed()
    tb_test.setup_env(current_version_id = 'testbed.version.1')
    tb_test.activate()


