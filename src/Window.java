import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame implements ActionListener {

    public Window(){
        super("Connor's Fractals");
        FractalPanel fPanel = new SierpinskiTriangle();

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //setResizable(false);
        getContentPane().add(fPanel);

        JMenuBar menuBar = new JMenuBar();
        JMenu fractalMenu = new JMenu("Fractals");
        JMenuItem sierpinski = new JMenuItem("Sierpinski Triangle");
        fractalMenu.add(sierpinski);
        menuBar.add(fractalMenu);
        setJMenuBar(menuBar);

        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        getContentPane().remove(0);
//        switch(e.getActionCommand()){
//            case e.
//        }
    }

    public static void main(String[] args){
        new Window();
    }

}
