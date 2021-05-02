

package listeners;

import javax.swing.event.UndoableEditEvent;
import javax.swing.event.UndoableEditListener;
import javax.swing.undo.UndoManager;
import view.NotebookUI;


public class UMListener implements UndoableEditListener{

    UndoManager um ;
    NotebookUI notebookUI;
    
    @Override
    public void undoableEditHappened(UndoableEditEvent e) {
            um.addEdit(e.getEdit());
            notebookUI.undoRedoUpdate();
    }

    public void setUm(UndoManager um) {
        this.um = um;
    }

    public void setNotebookUI(NotebookUI notebookUI) {
        this.notebookUI = notebookUI;
    }
    
    
}
