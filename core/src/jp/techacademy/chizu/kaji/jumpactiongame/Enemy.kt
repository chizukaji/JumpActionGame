package jp.techacademy.chizu.kaji.jumpactiongame

import com.badlogic.gdx.graphics.Texture

class Enemy (texture: Texture, srcX: Int, srcY: Int, srcWidth: Int, srcHeight: Int)
    : GameObject(texture, srcX, srcY, srcWidth, srcHeight) {

    companion object {
        // 横幅、高さ
        val ENEMY_WIDTH = 1.0f
        val ENEMY_HEIGHT = 1.0f

        // 速度
        val ENEMY_VELOCITY = 2.0f
    }

    var mState: Int = 0

    init {
        setSize(ENEMY_WIDTH, ENEMY_HEIGHT)
        velocity.x = ENEMY_VELOCITY
    }

    fun update(deltaTime: Float) {
        x += velocity.x * deltaTime
        velocity.add(0f, 0f)

        if (x < ENEMY_WIDTH / 2) {
            velocity.x = -velocity.x
            x = ENEMY_WIDTH / 2
        }
        if (x > GameScreen.WORLD_WIDTH - ENEMY_WIDTH / 2) {
            velocity.x = -velocity.x
            x = GameScreen.WORLD_WIDTH - ENEMY_WIDTH / 2
        }
    }






}