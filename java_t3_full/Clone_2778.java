protected void onCreate (Bundle savedInstanceState) {
    super.onCreate (savedInstanceState);
    setContentView (R.layout.activity_main);
    Window window = this.getWindow ();
    window.addFlags (WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);
    window.addFlags (WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
    window.addFlags (WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
    txtMessage = (TextView) findViewById (R.id.txtMesssage);
    Button buttonOne = (Button) findViewById (R.id.block1);
    Button buttonTwo = (Button) findViewById (R.id.block2);
    Button buttonThree = (Button) findViewById (R.id.block3);
    Button buttonFour = (Button) findViewById (R.id.block4);
    Button buttonFive = (Button) findViewById (R.id.block5);
    Button buttonSix = (Button) findViewById (R.id.block6);
    buttonOne.setOnClickListener (this);
    buttonTwo.setOnClickListener (this);
    buttonThree.setOnClickListener (this);
    buttonFour.setOnClickListener (this);
    buttonFive.setOnClickListener (this);
    buttonSix.setOnClickListener (this);
}






protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Window window = this.getWindow();
    window.addFlags(WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD);
    window.addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED);
    window.addFlags(WindowManager.LayoutParams.FLAG_TURN_SCREEN_ON);
    TextView txtMessage = findViewById(R.id.txtMessage);
    View.OnClickListener listener = view -> yourMethod();
    Button buttonOne = findViewById(R.id.block1);
    Button buttonTwo = findViewById(R.id.block2);
    Button buttonThree = findViewById(R.id.block3);
    Button buttonFour = findViewById(R.id.block4);
    Button buttonFive = findViewById(R.id.block5);
    Button buttonSix = findViewById(R.id.block6);

    buttonOne.setOnClickListener(listener);
    buttonTwo.setOnClickListener(listener);
    buttonThree.setOnClickListener(listener);
    buttonFour.setOnClickListener(listener);
    buttonFive.setOnClickListener(listener);
    buttonSix.setOnClickListener(listener);
}


