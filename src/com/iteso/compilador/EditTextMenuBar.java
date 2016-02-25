package com.iteso.compilador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Daniel on 24/02/2016.
 */
public class EditTextMenuBar extends JMenuBar implements ActionListener{
    private Button save;
    private Button open;
    private Button close;
    private Button build;
    private Button run;
    private Button copy;
    private Button paste;
    private Button cut;
    private TextEditor editor;

    public EditTextMenuBar(TextEditor editor){
        save = new Button();
        open = new Button();
        close = new Button();
        build = new Button();
        run = new Button();
        copy = new Button();
        paste = new Button();
        cut = new Button();
        this.editor = editor;

        init();
    }

    private void init(){
        add(save);
        add(open);
        add(close);
        add(build);
        add(run);
        add(copy);
        add(paste);
        add(cut);

        save.setLabel("Save");
        open.setLabel("Open");
        close.setLabel("Close");
        build.setLabel("Build");
        run.setLabel("Run");
        copy.setLabel("Copy");
        paste.setLabel("Paste");
        cut.setLabel("cut");

        save.addActionListener(this);
        open.addActionListener(this);
        close.addActionListener(this);
        build.addActionListener(this);
        run.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        cut.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == save){
            editor.onSaveFile();
        }else if(e.getSource() == open){
            editor.onOpenFile("");
        }else if(e.getSource() == close){
            editor.onCloseFile();
        }else if(e.getSource() == build){
            editor.onBuildProject();;
        }else if(e.getSource() == run){
            editor.onRunProject();
        }else if(e.getSource() == copy){
            editor.onCopyText();
        }else if(e.getSource() == paste){
            editor.onPasteText();
        }else if(e.getSource() == cut){
            editor.onCutText();
        }
    }
}
