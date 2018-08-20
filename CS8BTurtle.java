/* Name: Jiaqi Fan
 * ID: A12584051
 * CSEID: cse8bwang
 * Filename: CSE8BTurtle.java
 * Date: 3/7/2016
 */

import turtleClasses.*;
import java.awt.Color;
/*
 * Name: CS8BTurtle
 * This class extends turtle class and using tutle to draw
 * out the letter by letter in the center of the world
 */
public class CS8BTurtle extends Turtle
{
  private final static int CHAR_WIDTH = 40;
  private final static int CHAR_HEIGHT = 80;
  private final static int CHAR_HEIGHT2 = 10;
  private final static int CHAR_WIDTH2 = 20;
  private final static int CHAR_WIDTH3 = 30;
  private final static int PADDING_BETWEEN_CHARS = 40;
  private final static int PADDING_BETWEEN_LINES = 40;
  private final static int CHAR_SPACING = CHAR_WIDTH + PADDING_BETWEEN_CHARS;
  private final static int CHAR_SPACING2 = CHAR_WIDTH + CHAR_HEIGHT;//double space between C,S and N,D
  private final static int LINE_SPACING = CHAR_HEIGHT + PADDING_BETWEEN_LINES;
  
  private final static int START_X_1 = 10; // starting x offset for line 1
  private final static int START_X_2 = 10; // starting x offset for line 2
  private final static int START_X_3 = 10; // starting x offset for line 3
  private final static int START_Y = 10; // starting y offset
  
  private final static int PEN_WIDTH = 10;
  private final static Color PEN_COLOR = Color.BLUE;
  private final static int WORLD_WIDTH = 800;
  private final static int WORLD_HEIGHT = 500;
  // Delay between turtle actions (turns, moves) in milliseconds.
  // 1000 = 1 sec. so 200 = 0.2 sec.
  private final static int DELAY = 500;
  
  
  public CS8BTurtle(World w, int delay)
  {
    super(w,delay); //on the wolrd with delay 
  }
  
  /*
   * Name: draw C
   * Purpose: the the letter C on the world
   * Parameters: int x, int y is the start position
   * Return: void
   */  
  private void drawC(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block
    turnToFace(getXPos()+1, getYPos()); // face right
    penDown();
    forward(CHAR_WIDTH);
    backward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_HEIGHT);
    turnLeft();
    forward(CHAR_WIDTH);
  }
  
  /*
   * Name: draw S
   * Purpose: the the letter S on the world
   * Parameters: int x, int y is the start position
   * Return: void
   */  
  private void drawS(int x, int y) {
    penUp();
    moveTo(x, y); // always start in upper left corner of this char block
    turnToFace(getXPos() + 1, getYPos()); // face right
    penDown();
    forward(CHAR_WIDTH);
    backward (CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
  }
  
  /*
   * Name: draw 8
   * Purpose: the the letter 8 on the world
   * Parameters: int x, int y is the start position
   * Return: void
   */
  private void draw8(int x, int y)
  {
    penUp();
    moveTo(x,y);
    turnToFace(getXPos() + 1, getYPos());
    penDown();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_HEIGHT);
    turnRight();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_HEIGHT);
    backward(CHAR_HEIGHT/2);
    turnRight();
    forward(CHAR_WIDTH);
  }
  
  /*
   * Name: draw B
   * Purpose: the the letter 8 on the world
   * Parameters: int x, int y is the start position
   * Return: void
   */
  private void drawB(int x, int y)
  {
    penUp();
    moveTo(x,y);
    turnToFace(getXPos() + 1, getYPos());
    penDown();
    turn(30);
    forward(CHAR_WIDTH);
    turn(120);
    forward(CHAR_WIDTH);
    turn(-120);
    forward(CHAR_WIDTH);
    turn(120);
    forward(CHAR_WIDTH);
    turnToFace(getXPos(), getYPos() - 1);
    forward(CHAR_HEIGHT);
  }
  /*
   * Name: draw W
   * Purpose: the the letter W on the world
   * Parameters: int x, int y is the start position
   * Return: void
   */
  private void drawW(int x, int y)
  {
    penUp();
    moveTo(x,y);
    turnToFace(getXPos(), getYPos() + 1);
    penDown();
    turn(-10);
    forward(CHAR_HEIGHT);
    turn(-120); //turn face
    forward(CHAR_WIDTH2); // small width
    turn(90);
    forward(CHAR_WIDTH2);
    turn(-125);
    forward(CHAR_HEIGHT);
  }
  
  /*
   * Name: draw A
   * Purpose: the the letter A on the world
   * Parameters: int x, int y is the start position
   * Return: void
   */
  private void drawA(int x, int y)
  {
    penUp();
    moveTo(x,y);//start in upper left corner
    turnToFace(getXPos()+1, getYPos());//face right
    penDown();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_HEIGHT);
    penUp();//stop writing
    moveTo(x,y);//return to start point
    turnToFace(getXPos(), getYPos()+1);//face down
    penDown();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_WIDTH);
    backward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
  }
  /*
   * Name: draw N
   * Purpose: the the letter N on the world
   * Parameters: int x, int y is the start position
   * Return: void
   */  
  private void drawN(int x, int y)
  {
    penUp();
    moveTo(x,y);
    turnToFace(getXPos()+1, getYPos()+2);//face down right
    penDown();
    forward(CHAR_HEIGHT+10);//give a little more higher
    turnToFace(getXPos(),getYPos()-1);
    forward(CHAR_HEIGHT);
    penUp();
    moveTo(x,y);
    penDown();
    turnToFace(getXPos(), getYPos()+1);
    forward(CHAR_HEIGHT);
  }
  /*
   * Name: draw G
   * Purpose: the the letter G on the world
   * Parameters: int x, int y is the start position
   * Return: void
   */ 
  private void drawG(int x , int y)
  {
    penUp();
    moveTo(x,y);
    turnToFace(getXPos()+1, getYPos());
    penDown();
    forward(CHAR_WIDTH);
    backward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_HEIGHT);
    turnLeft();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_HEIGHT2);
  }
  /*
   * Name: draw I
   * Purpose: the the letter I on the world
   * Parameters: int x, int y is the start position
   * Return: void
   */  
  private void drawI(int x, int y)
  {
    penUp();
    moveTo(x,y);
    turnToFace(getXPos()+1, getYPos()); //turn face right
    penDown();
    forward(CHAR_WIDTH);
    backward(CHAR_WIDTH2); //move back half width
    turnRight();//face down
    forward(CHAR_HEIGHT);
    turnLeft(); 
    forward(CHAR_WIDTH2); //repeat the top part
    backward(CHAR_WIDTH);
  }
  /*
   * Name: draw T
   * Purpose: the the letter T on the world
   * Parameters: int x, int y is the start position
   * Return: void
   */ 
  private void drawT(int x, int y)
  {
    penUp();
    moveTo(x,y);
    turnToFace(getXPos()+1, getYPos()); //turn face right
    penDown();
    forward(CHAR_WIDTH);
    backward(CHAR_WIDTH2); //move back half width
    turnRight();//face down
    forward(CHAR_HEIGHT);
  }
  /*
   * Name: draw E
   * Purpose: the the letter E on the world
   * Parameters: int x, int y is the start position
   * Return: void
   */  
  private void drawE(int x, int y)
  {
    penUp();
    moveTo(x,y);//start in upper left corner
    turnToFace(getXPos()+1, getYPos());//face right
    penDown();
    forward(CHAR_WIDTH);
    backward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_WIDTH);
    backward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_WIDTH);
  }
  /*
   * Name: draw R
   * Purpose: the the letter R on the world
   * Parameters: int x, int y is the start position
   * Return: void
   */ 
  private void drawR(int x, int y) 
  {
    penUp();
    moveTo(x,y);
    turnToFace(getXPos() + 1, getYPos());
    penDown();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_HEIGHT/2);
    turnRight();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_HEIGHT/2);
    backward(CHAR_HEIGHT);
    turnToFace(getXPos(), getYPos() - 1);
    forward(CHAR_HEIGHT/2);
    turnToFace(getXPos() + 1, getYPos() + 1);
    forward(CHAR_HEIGHT*2/3);
  }
  /*
   * Name: draw 2
   * Purpose: the the letter 2 on the world
   * Parameters: int x, int y is the start position
   * Return: void
   */   
  private void draw2(int x, int y)
  {
    penUp();
    moveTo(x,y);
    penDown();
    turnToFace(getXPos() + 1, getYPos());
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_HEIGHT/2);
    turnRight();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_HEIGHT/2);
    turnLeft();
    forward(CHAR_WIDTH);
  }
  /*
   * Name: draw 0
   * Purpose: the the letter 0 on the world
   * Parameters: int x, int y is the start position
   * Return: void
   */    
  private void draw0(int x, int y) 
  {    
    penUp();
    moveTo(x,y);
    penDown();
    turnToFace(getXPos() + 1, getYPos());
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_HEIGHT);
    turnRight();
    forward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_HEIGHT);
  }
  /*
   * Name: draw 1
   * Purpose: the the letter 1 on the world
   * Parameters: int x, int y is the start position
   * Return: void
   */   
  private void draw1(int x, int y)
  {
    penUp();
    moveTo(x+8, y+8);//start in upper left corner but little lower
    turnToFace(getXPos()+1,getYPos()-1);//face up right
    penDown();
    forward(CHAR_HEIGHT2);
    turnToFace(getXPos(), getYPos() +1);//face down
    forward(CHAR_HEIGHT);
    turnLeft();
    forward(CHAR_WIDTH2);
    backward(CHAR_WIDTH);
  }
  /*
   * Name: draw 6
   * Purpose: the the letter 6 on the world
   * Parameters: int x, int y is the start position
   * Return: void
   */   
  private void draw6(int x, int y)
  {
    penUp();
    moveTo(x,y);
    turnToFace(getXPos() + 1, getYPos());
    penDown();
    forward(CHAR_WIDTH);
    backward(CHAR_WIDTH);
    turnRight();
    forward(CHAR_HEIGHT);
    turnLeft();
    forward(CHAR_WIDTH);
    turnLeft();
    forward(CHAR_HEIGHT/2);
    turnLeft();
    forward(CHAR_WIDTH);
  }
  
  
  public static void main(String[] args)
  {
    World w = new World(WORLD_WIDTH, WORLD_HEIGHT);
    CS8BTurtle sora = new CS8BTurtle(w, DELAY);
    sora.setPenWidth(PEN_WIDTH);
    sora.setPenColor(PEN_COLOR);
    int centerX = 2*PADDING_BETWEEN_CHARS;
    int centerY = 2*PADDING_BETWEEN_CHARS;
    int padding = PADDING_BETWEEN_CHARS;
    sora.drawC(START_X_1 + centerX, START_Y + centerY);
    sora.drawS(START_X_1 + 2*padding + centerX, START_Y + centerY);
    sora.draw8(START_X_1 + 4*padding + centerX, START_Y + centerY);
    sora.drawB(START_X_1 + 6*padding + centerX, START_Y + centerY);
    sora.drawW(START_X_1 + 8*padding + centerX, START_Y  + centerY);
    sora.drawA(START_X_1 + 10*padding + centerX, START_Y  + centerY);
    sora.drawN(START_X_1 + 12*padding + centerX, START_Y  + centerY);
    sora.drawG(START_X_1 + 14*padding + centerX, START_Y  + centerY);
    
    sora.drawW(START_X_1 + 2*padding + centerX, START_Y  + LINE_SPACING + centerY);
    sora.drawI(START_X_1 + 4*padding + centerX, START_Y  + LINE_SPACING + centerY);
    sora.drawN(START_X_1 + 6*padding + centerX, START_Y  + LINE_SPACING + centerY);
    sora.drawT(START_X_1 + 8*padding + centerX, START_Y  + LINE_SPACING + centerY);
    sora.drawE(START_X_1 + 10*padding + centerX, START_Y  + LINE_SPACING + centerY);
    sora.drawR(START_X_1 + 12*padding + centerX, START_Y  + LINE_SPACING + centerY);
    
    sora.draw2(START_X_1 + 4*padding + centerX, START_Y  + 2*LINE_SPACING + centerY);
    sora.draw0(START_X_1 + 6*padding + centerX, START_Y  + 2*LINE_SPACING + centerY);
    sora.draw1(START_X_1 + 8*padding + centerX, START_Y  + 2*LINE_SPACING + centerY);
    sora.draw6(START_X_1 + 10*padding + centerX, START_Y  + 2*LINE_SPACING + centerY);
    
  }
  
  
  
  
  
  
}