

package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import view.NotebookUI;


public class PopupActions implements ActionListener{

    NotebookUI notebookUI;
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println("igen" + e);
        notebookUI.keres(e.getActionCommand());
    }
    
    public void setNotebookUI(NotebookUI notebookUI) {
        this.notebookUI = notebookUI;
    }
}
