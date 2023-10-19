/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import javax.swing.JTextField;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;

//esta classe converte o que foi digitado no jtfield em maiusculo

public class meuJTextField extends JTextField {

    public meuJTextField() {

        DocumentFilter filter = new UpperCaseField();
        ((AbstractDocument) this.getDocument()).setDocumentFilter(filter);

    }

}

class UpperCaseField extends DocumentFilter {

    public void insertString(DocumentFilter.FilterBypass fb, int offset, String text,
            AttributeSet attr) throws BadLocationException {
        if (text != null) {
            fb.insertString(offset, text.toUpperCase(), attr);
        }
    }

    public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text,
            AttributeSet attrs) throws BadLocationException {
        if (text != null) {
            fb.replace(offset, length, text.toUpperCase(), attrs);
        } else {
            fb.replace(offset, length, null, attrs);
        }
    }
}
