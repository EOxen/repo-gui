import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Dimension;
import java.awt.RenderingHints;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/**
 * Java 1. Homework 8.
 *
 * @author Elena Oxenhorn
 * @version 07.10.2021
 */

public class GameSnake extends JFrame {

    final String TITLE_OF_PROGRAM = "Classic Game Snake";
    final String GAME_OVER_MSG = "GAME OVER";
    static final int CELL_SIZE = 20;           // size of cell in pix
    static final int CANVAS_WIDTH = 40;        // width in cells
    static final int CANVAS_HEIGHT = 30;       // height in cells
    final int START_SNAKE_SIZE = 5;            // initialization data
    final int START_SNAKE_X = CANVAS_WIDTH/2;  //   for
    final int START_SNAKE_Y = CANVAS_HEIGHT/2; //   snake
    final static Color SNAKE_COLOR = Color.darkGray;
    final static Color FOOD_COLOR = Color.green;
    final Color POISON_COLOR = Color.red;
    final static int KEY_LEFT = 37;             // codes
    final static int KEY_UP = 38;               //   of
    final static int KEY_RIGHT = 39;            //   cursor
    final static int KEY_DOWN = 40;             //   keys
    final int SNAKE_DELAY = 150;                // snake delay in milliseconds
    boolean gameOver = false;                   // a sign game is over or not

    Canvas canvas;                   // canvas object for rendering (drawing)
    Snake snake;                     // declare a snake object
    Food food;                       // declare a food object

    public static void main(String[] args) {    // starting method
        new GameSnake().game();                 // create an object and call game()
    }

    public GameSnake() {
        setTitle(TITLE_OF_PROGRAM + " : " + START_SNAKE_SIZE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        canvas = new Canvas();
        canvas.setBackground(Color.white);
        canvas.setPreferredSize(new Dimension(
                CELL_SIZE * CANVAS_WIDTH - 10,
                CELL_SIZE * CANVAS_HEIGHT - 10));

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                snake.setDirection(e.getKeyCode());
            }
        });
        add(canvas);                 // add a panel for rendering
        pack();                      // bringing the window to the required size
        setLocationRelativeTo(null); // the window will be in the center
        setResizable(false);         // prohibit window resizing
        setVisible(true);            // make the window visible
    }

    private void game() {            // method containing game cycle
        // creating snake object
        snake = new Snake(START_SNAKE_X, START_SNAKE_Y, START_SNAKE_SIZE, KEY_RIGHT);
        // food object
        food = new Food(snake);
        snake.setFood(food);

        while (!gameOver) {          // game cycle while NOT gameOver
            // snake move
            snake.move();
            // if the snake ate the food {
            //   show food in new place
            // }
            if (food.isEaten()) {
                food.appear();
            }
            canvas.repaint();        // repaint panel/window
            sleep(SNAKE_DELAY);      // to make delay in milliseconds
        }
        JOptionPane.showMessageDialog(this, GAME_OVER_MSG);
    }

    private void sleep(long ms) {    // method for suspending
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    class Canvas extends JPanel {    // class for rendering (drawing)
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            Graphics2D g2D = (Graphics2D) g;
            g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            snake.paint(g2D);
            food.paint(g2D);
        }
    }
}