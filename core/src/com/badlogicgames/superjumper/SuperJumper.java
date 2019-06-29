package com.badlogicgames.superjumper;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogicgames.superjumper.assets.Assets;
import com.badlogicgames.superjumper.game.Settings;
import com.badlogicgames.superjumper.screen.MainMenuScreen;

public class SuperJumper extends Game {
	// used by all screens
	public SpriteBatch batcher;
	
	@Override
	public void create () {
		batcher = new SpriteBatch();
		Settings.load();
		Assets.load();
		setScreen(new MainMenuScreen(this));
	}
	
	@Override
	public void render() {
		super.render();
	}
}
