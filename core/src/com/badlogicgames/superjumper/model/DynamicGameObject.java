package com.badlogicgames.superjumper.model;

import com.badlogic.gdx.math.Vector2;
import com.badlogicgames.superjumper.model.GameObject;

public class DynamicGameObject extends GameObject {
	public final Vector2 velocity;
	public final Vector2 accel;

	public DynamicGameObject (float x, float y, float width, float height) {
		super(x, y, width, height);
		velocity = new Vector2();
		accel = new Vector2();
	}
}
