import java.awt.*;
import java.awt.event.*;

public class MaxOfThreeAWT extends Frame implements ActionListener {

    TextField t1 = new TextField(), t2 = new TextField(), t3 = new TextField();
    Label res = new Label();
    Button b = new Button("Max");

    MaxOfThreeAWT() {
        setLayout(new GridLayout(4,2));
        add(new Label("First:")); add(t1);
        add(new Label("Second:")); add(t2);
        add(new Label("Third:")); add(t3);
        add(b); add(res);

        b.addActionListener(this);

        setSize(250,150);
        setTitle("Max of 3 Numbers");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) { dispose(); }
        });
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = Integer.parseInt(t3.getText());
        int max = Math.max(a, Math.max(b, c));
        res.setText("Max: " + max);
    }

    public static void main(String[] args) {
        new MaxOfThreeAWT();
    }
}
