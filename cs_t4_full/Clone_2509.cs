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




protected override void Update (GameTime gameTime) 
{
   this._keyboardState = Keyboard.GetState();
   GameState gState = _gameState;

   if (_keyboardState.IsKeyDown(Keys.A)) { gState = GameState.Menu; }
   if (_keyboardState.IsKeyDown(Keys.B)) { gState = GameState.InGame; }
   if (_keyboardState.IsKeyDown(Keys.C)) { gState = GameState.Undefined; }

   _gameState = gState;

   if (_gameState == GameState.Undefined) { MediaPlayer.Stop(); }
   else if (_gameState == GameState.Menu) { MediaPlayer.Stop(); MediaPlayer.Play(_song1); }
   else if (_gameState == GameState.InGame) { MediaPlayer.Stop(); MediaPlayer.Play(_song2); }

   base.Update(gameTime);
}


