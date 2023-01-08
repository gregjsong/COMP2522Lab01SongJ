package org.bcit.comp2522.labs.lab01;

import processing.core.PApplet;

/**
 * Window creates a window with an image of a simple Pacman game.
 */
public class Window extends PApplet {

  /**
   * Sets settings for the Window.
   */
  public void settings() {
    size(500, 500);
  }

  /**
   * Draws features of a Pacman game.
   */
  public void draw() {
    background(0);
    drawPacman();
    drawCircles();
    drawLines();
    drawGhost(380, 250);
  }

  /**
   * Draws Pacman facing right.
   */
  public void drawPacman() {
    fill(255, 231, 55);
    stroke(255, 231, 55);
    arc(100, 250, 200, 200, QUARTER_PI, PI + HALF_PI + QUARTER_PI, PIE);
  }

  /**
   * Draws circles.
   */
  public void drawCircles() {
    circle(200, 250, 50);
  }

  /**
   * Draws borders.
   */
  public void drawLines() {
    stroke(25, 25, 166);
    strokeWeight(10);
    line(0, 100, 400, 100);
    line(0, 400, 500, 400);
    line(400, 100, 400, 0);
    strokeWeight(1);
  }

  /**
   * Draws a Ghost at x and y.
   *
   * @param x an int, represents x-coordinate to center Ghost.
   * @param y an int, represents y-coordinate to center Ghost.
   */
  public void drawGhost(int x, int y) {
    // body
    fill(255, 184, 255);
    stroke(255, 184, 255);
    arc(x, y, 200, 200, PI, 2 * PI);
    rect(x - 100, y, 200, 75);
    triangle(x - 100, y + 75, x - 50, y + 75, x - 75, y + 100);
    triangle(x - 50, y + 75, x, y + 75, x - 25, y + 100);
    triangle(x, y + 75, x + 50, y + 75, x + 25, y + 100);
    triangle(x + 50, y + 75, x + 100, y + 75, x + 75, y + 100);
    // eyes
    fill(255, 255, 255);
    ellipse(x - 40, y, 40, 50);
    ellipse(x + 40, y, 40, 50);
    stroke(33, 33, 222);
    fill(33, 33, 222);
    circle(x - 45, y, 25);
    circle(x + 35, y, 25);
  }

  /**
   * Changes background color on mouse press.
   */
  public void mousePressed() {
    background(64);
  }

  /**
   * Drives the program.
   *
   * @param args unused.
   */
  public static void main(String[] args) {
    String[] processingArgs = {"window"};
    Window window = new Window();
    PApplet.runSketch(processingArgs, window);
  }
}
