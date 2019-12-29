package afterDuplicate;
import java.awt.*;
import java.awt.event.*;

public class IntegerDisplay extends Frame implements ActionListener, ValueListener {
    private final Label _octalLabel = new Label("0");
    private final Label _decimalLabel = new Label("0");
    private final Label _hexadecimalLabel = new Label("0");
    private final Button _incrementButton = new Button("+");
    private final Button _decrementButton = new Button("-");

    private Value value=new Value(0);
    
    private final Graph circle=Graph.createGraph(Graph.CIRCLE, 100, 100);
    private final Graph rectangle=Graph.createGraph(Graph.RECTANGLE, 100, 50);

    public IntegerDisplay() {
        super("IntegerDisplay");
        value.addListener(this);
        value.addListener(circle);
        value.addListener(rectangle);

        setLayout(new GridLayout(4, 2));
        add(new Label("Octal:"));
        add(_octalLabel);
        add(new Label("Decimal:"));
        add(_decimalLabel);
        add(new Label("Hexadecimal:"));
        add(_hexadecimalLabel);
        add(_incrementButton);
        add(_decrementButton);

        _incrementButton.addActionListener(this);
        _decrementButton.addActionListener(this);
        
        add(circle, BorderLayout.CENTER);
        add(rectangle, BorderLayout.SOUTH);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == _incrementButton) {
            setValue(value.getValue() + 1);
        } else if (e.getSource() == _decrementButton) {
            setValue(value.getValue()  - 1);
        }
    }

    public int getValue() {
        return this.value.getValue();
    }

    public void setValue(int value) {
        this.value.setValue(value);
        
    }

	@Override
	public void valueChanged(ValueChangeEvent e) {
		// TODO Auto-generated method stub
		_octalLabel.setText(Integer.toString(this.value.getValue() , 8));
        _decimalLabel.setText(Integer.toString(this.value.getValue(), 10));
        _hexadecimalLabel.setText(Integer.toString(this.value.getValue(), 16));
	}
}
