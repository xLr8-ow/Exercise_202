
import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;


public class SenderTableRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object o, boolean bln, boolean bln1, int i, int i1) {

        Sender s = (Sender) o;
        JLabel label = new JLabel();
        label.setOpaque(true);
        
        return label;
    }
    
}
