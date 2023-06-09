package Metodos;
import javax.swing.*;
import javax.swing.text.NumberFormatter;
import java.text.NumberFormat;

public class SoNumeros extends DefaultCellEditor {
    public SoNumeros() {
        super(new JFormattedTextField(createFormatter()));
    }

    private static NumberFormatter createFormatter() {
        NumberFormat format = NumberFormat.getIntegerInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setAllowsInvalid(false);
        return formatter;
    }
}

