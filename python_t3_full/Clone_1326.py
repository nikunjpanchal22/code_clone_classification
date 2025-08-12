def upgrade() :
	url = context.config.get_main_option("sqlalchemy.url")
	engine = sa.create_engine(url)
	DBSession.configure(bind = engine)
	op.create_table(
	'client_credential',
	sa.Column('id', sa.Integer(), nullable = False),
	sa.Column('created_at', sa.DateTime(), nullable = False),
	sa.Column('updated_at', sa.DateTime(), nullable = False),
	sa.Column('client_id', sa.Integer(), nullable = False),
	sa.Column('key', sa.String(length = 22), nullable = False),
	sa.Column('secret', sa.String(length = 44), nullable = False),
	sa.Column('is_active', sa.Boolean(), nullable = False),
	sa.ForeignKeyConstraint(['client_id'], ['client.id'],),
	sa.PrimaryKeyConstraint('id'),
	sa.UniqueConstraint('key'))
	clients = [
	{'secret' : client.secret,
	'key' : client.key,
	'is_active' : True,
	'client_id' : client.id,
	'created_at' : sa.func.now(),
	'updated_at' : sa.func.now()} for client in Client.query.all()]
	op.bulk_insert(ClientCredential, clients)
	op.drop_column(u'client', u'secret')
	op.drop_column(u'client', u'key')


#Implementation 4: 
def upgrade():
	url = context.config.get_main_option("sqlalchemy.url")
	engine = sa.create_engine(url)
	DBSession.configure(bind = engine)
	op.create_table(
	'client_credential',
	sa.Column('id', sa.Integer(), nullable = False),
	sa.Column('created_at', sa.DateTime(), nullable = False),
	sa.Column('updated_at', sa.DateTime(), nullable = False),
	sa.Column('client_id', sa.Integer(), nullable = False),
	sa.Column('key', sa.String(length = 22), nullable = False),
	sa.Column('secret', sa.String(length = 44), nullable = False),
	sa.Column('is_active', sa.Boolean(), nullable = False),
	sa.ForeignKeyConstraint(['client_id'], ['client.id'],),
	sa.PrimaryKeyConstraint('id'),
	sa.UniqueConstraint('key'))
	
	clients = []

	for client in Client.query.all():
		client_info = {
			'secret':client.secret,
			'key':client.key,
			'client_id':client.id,
			'is_active':True,
			'created_at': sa.func.utcnow(),
			'updated_at': sa.func.utcnow()
		}
		clients.append(client_info)

	if clients:
		op.bulk_insert(ClientCredential, clients)

	op.execute('ALTER TABLE client DROP COLUMN secret, DROP COLUMN key;')


