

package control;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.NotebookUI;


public class Controller {

    private String fileName;
    private String fileDir;
    private final String[] charsetTested = {"UTF-8", "windows-1250" ,"IBM852"};
    private final List<String> charsetTested1 = new ArrayList<>();
    private final NotebookUI notebookUI;
    private boolean wordWrapON = false;
    public enum COLORNAME {WHITE,BLACK, BLUE, RED};
    public enum FONTNAME  {ARIAL, COMIC, DIALOG, HELVETICA, MGOTHIC, TIMES};
    private Font arial, comicSansMs, dialog, helvetica, 
                 msGothic, timesNewRoman;
    private FONTNAME selectedFont = FONTNAME.ARIAL;

    public Controller(NotebookUI notebookUI) {
        this.notebookUI = notebookUI;
    }
    
//<editor-fold defaultstate="collapsed" desc="File menü metódusai">
    // File menü metódusai
   
    public void newFile(){
        fileName = null;
        fileDir = null;
    }
    
    public void openFile(){
        try {
            FileDialog fd = new FileDialog(notebookUI,"File megnyitás" ,FileDialog.LOAD);
            fd.setVisible(true);
            if (fd.getFile() != null) {
                fileName = fd.getFile();
                fileDir = fd.getDirectory();
                notebookUI.cimkeIr(fileName);
                File file = new File(fileDir + fileName);
                Charset charset = detectCharset(file, charsetTested);
                if (charset != null) {
                    notebookUI.del();
                    Scanner sc = new Scanner(file, charset);
                    while (sc.hasNextLine()) {
                        notebookUI.sortIr(sc.nextLine());
                    }
                } else {
                    JOptionPane.showMessageDialog(notebookUI, "A fájlt nem lehet megnyitni");
                }
            }

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(notebookUI, "Hiba a file megnyitásnál!");
        }
    }

    public void saveFile(){
        System.out.println(fileName);
        if (fileName == null) {
            saveAsFile();
        } else {
            PrintWriter pw = null;
            try {
                pw = new PrintWriter(fileDir + fileName);
                pw.write(notebookUI.olvas());
                pw.close();
            } catch (FileNotFoundException ex) {
                System.out.println("A fálj írása során hibe lépet fel!");
            } finally {
                pw.close();
            }
        }
    }
    
    public void saveAsFile(){
        FileDialog fd = new FileDialog(notebookUI, "Fálj mentése másként", FileDialog.SAVE);
        fd.setVisible(true);
        
        if (fd.getFile() != null) {
            fileName = fd.getFile();
            fileDir = fd.getDirectory();
            notebookUI.cimkeIr(fileName);
            try {
                PrintWriter pw = new PrintWriter(fileDir + fileName);
                pw.write(notebookUI.olvas());
                pw.close();
            } catch (FileNotFoundException ex) {
                System.out.println("A fálj írása során hibe lépet fel!");
            }
        }
    }
    
    public void exitFile(){
        System.exit(0);
    }
//</editor-fold> 
    
//<editor-fold defaultstate="collapsed" desc="Edit menü metódusai">   
 // Edit menü metódusai   
    public void undoEdit(){
        
    }
    
    public void redoEdit(){
        
    }
    
    public void cutEdit(){
        
    }
    
    public void copyEdit(){
        
    }
    
    public void pasteEdit(){
        
    }
    //</editor-fold> 
    
    
    // Format menü metódusai 
    public void wrapFormat(){
        if (!wordWrapON) {
            wordWrapON = true;
            notebookUI.wordWrapOn();
        }else {
            wordWrapON = false;
            notebookUI.wordWrapOff();
        }
    }
    
    public void generateFont(int fontSize){
        arial = new Font("Arial", Font.PLAIN, fontSize);
        comicSansMs = new Font("Comic Sans MS", Font.PLAIN, fontSize);
        dialog = new Font("Dialog", Font.PLAIN, fontSize);
        helvetica = new Font("Helvetica", Font.PLAIN, fontSize);
        msGothic = new Font("MS Gothic", Font.PLAIN, fontSize);
        timesNewRoman = new Font("Times New Roman", Font.PLAIN, fontSize);
        setFont(selectedFont);
    }
    
    public void setFont(FONTNAME name){
        selectedFont = name;
        switch (name) {
            case ARIAL: notebookUI.setFont_(arial); break;
            case COMIC: notebookUI.setFont_(comicSansMs); break;
            case DIALOG: notebookUI.setFont_(dialog); break;
            case HELVETICA: notebookUI.setFont_(helvetica); break;
            case MGOTHIC: notebookUI.setFont_(msGothic); break;
            case TIMES: notebookUI.setFont_(timesNewRoman); break;
        }
    }
    
    public void setColor(COLORNAME colorName){
        switch (colorName) {
            case WHITE: notebookUI.setColor(Color.WHITE,Color.BLACK); break;
            case BLACK: notebookUI.setColor(Color.BLACK,Color.WHITE); break;
            case BLUE: notebookUI.setColor(Color.BLUE,Color.WHITE); break;
            case RED: notebookUI.setColor(Color.RED,Color.WHITE); break;
        }
        
    }
    
    private Charset detectCharset(File file, String[] charsets) {
        Charset charset = null;
        for (String charsetName : charsets) {
            charset = detectCharset(file, Charset.forName(charsetName));
            if (charset != null) {
                charsetTested1.add(charset.toString());
            }
        }

        if (charsetTested1.size() > 0) {
            return Charset.forName(charsetTested1.get(0));
        }
        return charset;
    }

    private Charset detectCharset(File file, Charset charset) {
        try {
            FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis);
            CharsetDecoder decoder = charset.newDecoder();
            decoder.reset();
            byte[] buffer = new byte[512];
            boolean jo = false;
            while ((bis.read(buffer) != -1) && !jo) {
                jo = megfelel(buffer, decoder);
            }
            bis.close();
            if (jo) {
                return charset;
            } else {
                return null;
            }

        } catch (Exception e) {
            return null;
        }

    }

    private boolean megfelel(byte[] bytes, CharsetDecoder decoder) {
        try {
            decoder.decode(ByteBuffer.wrap(bytes));
        } catch (CharacterCodingException e) {
            return false;
        }
        return true;
    }
}
