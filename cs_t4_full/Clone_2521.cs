protected override void Update (GameTime gameTime) {
    GameState gameState = _gameState;
    var keyboardState = Keyboard.GetState ();
    if (keyboardState.IsKeyDown (Keys.A) && _keyboardState.IsKeyUp (Keys.A)) {
        gameState = GameState.Menu;
    } else if (keyboardState.IsKeyDown (Keys.B) && _keyboardState.IsKeyUp (Keys.B)) {
        gameState = GameState.InGame;
    } else if (keyboardState.IsKeyDown (Keys.C) && _keyboardState.IsKeyUp (Keys.C)) {
        gameState = GameState.Undefined;
    }
    _keyboardState = keyboardState;
    if (gameState != _gameState) {
        switch (gameState) {
            case GameState.Undefined :
                MediaPlayer.Stop ();
                break;
            case GameState.Menu :
                MediaPlayer.Stop ();
                MediaPlayer.Play (_song1);
                break;
            case GameState.InGame :
                MediaPlayer.Stop ();
                MediaPlayer.Play (_song2);
                break;
            default :
                throw new ArgumentOutOfRangeException ();
        }
        _gameState = gameState;
    }
    base.Update (gameTime);
}




protected override void Update(GameTime gameTime)
{
	    _keyboardState = Keyboard.GetState();

	    if (_keyboardState.IsKeyDown(Keys.A))
	    {
		PlayNewSong(GameState.Menu, _song1);
	    }
	    else if (_keyboardState.IsKeyDown(Keys.B))
	    {
		PlayNewSong(GameState.InGame, _song2);
	    }
	    else if (_keyboardState.IsKeyDown(Keys.C))
	    {
		PlayNewSong(GameState.Undefined, null);
	    }

	    base.Update(gameTime);
	}

	private void PlayNewSong(GameState newState, Song newSong)
	{
	    if (_gameState != newState)
	    {
		_gameState = newState;
		MediaPlayer.Stop();
		if (_gameState != GameState.Undefined)
		    MediaPlayer.Play(newSong);
	    }
}


