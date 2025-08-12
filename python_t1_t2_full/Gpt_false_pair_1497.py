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


#Implementation 1:
def Upgrade():
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
		clientInfo = {
			'secret' : client.secret,
			'key' : client.key,
			'is_active' : True,
			'client_id' : client.id,
			'created_at' : sa.func.now(),
			'updated_at' : sa.func.now()
		}
		clients.append(clientInfo)
	if len(clients) > 0:
		op.bulk_insert(ClientCredential,clients)
	op.drop_column(u'client', u'secret')
	op.drop_column(u'client', u'key')
