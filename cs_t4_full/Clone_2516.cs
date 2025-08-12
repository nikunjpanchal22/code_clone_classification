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



 

protected override async void Update (GameTime gameTime) 
{
    GameState newState = _keyboardState.IsKeyDown(Keys.A) ? GameState.Menu 
        : _keyboardState.IsKeyDown(Keys.B) ? GameState.InGame 
        : _keyboardState.IsKeyDown(Keys.C) ? GameState.Undefined 
        : _gameState;

    if (newState != _gameState) 
    {
        if (_gameState == GameState.Menu) { MediaPlayer.Stop(); await MediaPlayer.PlayAsync(_song1); }
        else if (_gameState == GameState.InGame) { MediaPlayer.Stop(); await MediaPlayer.PlayAsync(_song2); }
        else if (_gameState == GameState.Undefined) { MediaPlayer.Stop(); }
    }
    base.Update(gameTime);
}


