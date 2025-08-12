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


protected override void Update (GameTime gameTime) { 
    GameState gameState = _gameState; 
    var keyboardState = Keyboard.GetState (); 
    if (keyboardState.IsKeyDown (Keys.D) && _keyboardState.IsKeyUp (Keys.D)) {
        gameState = GameState.Done;     
    } else if (keyboardState.IsKeyDown (Keys.E) && _keyboardState.IsKeyUp (Keys.E)) {
        gameState = GameState.Exit; 
    } else if (keyboardState.IsKeyDown (Keys.F) && _keyboardState.IsKeyUp (Keys.F)) {
        gameState = GameState.Undefined;
    } 
    _keyboardState = keyboardState; 
    if (gameState != _gameState) {
        switch (gameState) {
            case GameState.Done:
                MediaElement.Stop ();
                break; 
            case GameState.Exit: 
                MediaElement.Stop ();
                MediaElement.Play (_song5); 
                break; 
            case GameState.Undefined: 
                MediaElement.Stop ();
                MediaElement.Play (_song6); 
                break; 
            default: 
                throw new ArgumentOutOfRangeException(); 
        }
        _gameState = gameState; 
    } 
    base.Update (gameTime); 
}
