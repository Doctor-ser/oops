import java.awt.*;
import java.awt.event.*;

public class SimpleCalculator extends Frame implements ActionListener {
    TextField t1 = new TextField(10), t2 = new TextField(10), res = new TextField(10);
    Button add = new Button("+"), sub = new Button("-"), mul = new Button("*"), div = new Button("/");

    SimpleCalculator() {
        setLayout(new FlowLayout());
        add(new Label("First:")); add(t1);
        add(new Label("Second:")); add(t2);

        Panel p = new Panel();
        p.add(add); p.add(sub); p.add(mul); p.add(div);
        add(p);

        res.setEditable(false);
        add(new Label("Result:")); add(res);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setSize(300,200);
        setTitle("Simple Calculator");
        setVisible(true);

        addWindowListener(new WindowAdapter(){ public void windowClosing(WindowEvent e){ dispose(); } });
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());
            double r = 0;
            if(e.getSource() == add) r = a + b;
            else if(e.getSource() == sub) r = a - b;
            else if(e.getSource() == mul) r = a * b;
            else if(e.getSource() == div) r = a / b;
            res.setText("" + r);
        } catch(Throwable ex) {
            res.setText("Error");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
