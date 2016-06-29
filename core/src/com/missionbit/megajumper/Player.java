package com.missionbit.megajumper;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Ryan on 6/21/2016.
 */
public class Player {
    private float accel;      //acceleration of player from accelerometer
    private Rectangle bounds; //hitbox of player
    private Vector2 position; //holds x and y position of player
    private Vector2 velocity; //x and y speed of player
    public Texture img;       //player image
    public Sprite sprite;     //resizable image

    public Player() {
        img = new Texture("claptrap golf.png");
        sprite = new Sprite(img);
        velocity = new Vector2();
        position = new Vector2();
        bounds = new Rectangle();
        sprite.setSize(150,150);
    }

    public void setAccel(float x, float multiplier) {accel = Gdx.input.getAccelerometerX() * multiplier;}

    public float getAccel() {return accel;}

    public void setPosition(float x, float y) {position.set(x, y);}

    public Vector2 getPosition() {
        return position;
    }

    public void setBounds(float x, float y) {bounds.set(x, y, sprite.getWidth(), sprite.getHeight());}

    public Rectangle getBounds() {
        return bounds;
    }

    public void setVelocity(float x, float y) {
        velocity.set(x, y);
    }

    public Vector2 getVelocity() {
        return velocity;
    }

    public void draw(SpriteBatch batch) {batch.draw(sprite, getPosition().x, getPosition().y,sprite.getWidth(),sprite.getHeight() );}
}
