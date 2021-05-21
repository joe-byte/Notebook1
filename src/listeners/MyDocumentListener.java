

package listeners;

import control.Controller;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import view.NotebookUI;


public class MyDocumentListener implements DocumentListener{

    NotebookUI notebookUI;
    
    @Override
    public void insertUpdate(DocumentEvent e) {
        notebookUI.setDocChanged(true);
        System.out.println("insert");
    }

    @Override
    public void removeUpdate(DocumentEvent e) {
        notebookUI.setDocChanged(true);
        //System.out.println("remove");
    }

    @Override
    public void changedUpdate(DocumentEvent e) {
    }

    public void setNotebookUI(NotebookUI notebookUI) {
        this.notebookUI = notebookUI;
    }

    

}
