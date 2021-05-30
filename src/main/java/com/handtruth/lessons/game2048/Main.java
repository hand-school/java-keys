package com.handtruth.lessons.game2048;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

public class Main extends Canvas implements Runnable {

    public static final int WIDTH = 400;
    public static final int HEIGHT = 400;
    public static float scale = 2.0f;
    public JFrame frame;
    public Thread thread;
    public Game game;
    public boolean running = false;
    public static BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    public static int[] pixels = ((DataBufferInt) image.getRaster().getDataBuffer()).getData();

    public Main() {
        setPreferredSize(new Dimension((int) (WIDTH * scale), (int) (HEIGHT * scale)));
        frame = new JFrame();
        game = new Game();
    }

    public void start() {
        running = true;
        thread = new Thread(this, "loopThread");
        thread.start();
    }

    public void stop() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void update() {
        game.update();
    }

    public void render() {
        BufferStrategy bufferStrategy = getBufferStrategy();
        if (bufferStrategy == null) {
            createBufferStrategy(3);
            return;
        }

        game.render();

        Graphics2D g = (Graphics2D) bufferStrategy.getDrawGraphics();
        g.drawImage(image, 0, 0, (int) (WIDTH * scale), (int) (HEIGHT * scale), null);
        game.renderText(g);
        bufferStrategy.show();
    }

    @Override
    public void run() {
        long lastTimeInNanoSeconds = System.nanoTime();
        long timer = System.currentTimeMillis();
        double nanoSecondsPerUpdate = 1000000000.0 / 60.0;
        double updatesToPerform = 0.0;
        int frames = 0;
        int updates = 0;
        requestFocus();


        while (running) {
            long currentTimeInNanoSeconds = System.nanoTime();
            updatesToPerform += (currentTimeInNanoSeconds - lastTimeInNanoSeconds) / nanoSecondsPerUpdate;
            if (updatesToPerform >= 1) {
                update();
                updates++;
                updatesToPerform--;
            }
            lastTimeInNanoSeconds = currentTimeInNanoSeconds;

            render();
            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                frame.setTitle("2048 " + updates + " updates, " + frames + " frames");
                updates = 0;
                frames = 0;
                timer += 1000;
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.frame.setResizable(false);
        main.frame.setTitle("Game Of 2048");
        main.frame.add(main);
        main.frame.pack();
        main.frame.setVisible(true);
        main.frame.setLocationRelativeTo(null);
        main.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        main.frame.setAlwaysOnTop(true);
        main.start();
    }

}
