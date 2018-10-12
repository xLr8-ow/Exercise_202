
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class SenderTableModel extends AbstractTableModel {

    private ArrayList<Sender> sender = new ArrayList<>();

    private static String[] colNames = {"Sender", "Frequenz", "Band"};

    @Override
    public int getRowCount() {
        return sender.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Sender s = sender.get(rowIndex);
        return s;
    }
    
    public void add(Sender s)
    {
        sender.add(sender.size()-1, s);
        fireTableRowsInserted(sender.size()-1, sender.size()-1);
    }

}
