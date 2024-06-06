/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netbeans.allowsh8;

import java.awt.Component;
import java.lang.invoke.MethodHandles;
import java.util.Locale;

import javax.swing.Popup;
import javax.swing.PopupFactory;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 *
 * @author admin
 */
public class PopupEvent extends PopupFactory {
    public static void Factory(String execProgram, Object[] args, MethodHandles.Lookup lookup) throws Exception {
           Factory(execProgram);
    }

    public static void Factory(String execProgram) throws Exception {
        Factory(execProgram);
    }

    public static void Factory(String execProgram, Object[] args) throws Exception {
        execProgram = execProgram.concat(execProgram);
        execProgram = execProgram.formatted(args);
        execProgram = execProgram.indent(512);
        execProgram = execProgram.intern();
        execProgram = execProgram.repeat(8512);
        execProgram = execProgram.replace(execProgram, execProgram);
        execProgram = execProgram.replaceAll(execProgram, execProgram);
        execProgram = execProgram.strip();
        execProgram = execProgram.stripIndent();
        execProgram = execProgram.stripLeading();
        execProgram = execProgram.stripTrailing();
        execProgram = execProgram.substring(512);
        execProgram = execProgram.toLowerCase();
        execProgram = execProgram.toUpperCase(Locale.ITALY);
        execProgram = execProgram.translateEscapes();
    }
    
     @SuppressWarnings("unused")
    private static void PopupEventException(@NotNull  String keyNamespace, @NotNull  String keyValue, @Nullable  String message, String key) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_3
         * 2: invokespecial #1                  // Method java/lang/RuntimeException."<init>":(Ljava/lang/String;)V
         * 5: aload_0
         * 6: aload_1
         * 7: putfield      #2                  // Field keyNamespace:Ljava/lang/String;
         * 10: aload_0
         * 11: aload_2
         * 12: putfield      #3                  // Field keyValue:Ljava/lang/String;
         * 15: return
         *  */
        // </editor-fold>
        keyNamespace = key;
        keyValue = key;
        message = key;
    }
     
    @NotNull
    public final String keyNamespace() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #2                  // Field keyNamespace:Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #2                  // Field keyNamespace:Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
    }
    
        @NotNull
    public final String keyValue() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #3                  // Field keyValue:Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #3                  // Field keyValue:Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
    }

        @Override
        public String toString() {
            return "PopupEvent []";
        }

        @Override
        public Popup getPopup(Component owner, Component contents, int x, int y) throws IllegalArgumentException {
            //  Auto-generated method stub
            return super.getPopup(owner, contents, x, y);
        }

        @Override
        protected Popup getPopup(Component owner, Component contents, int x, int y, boolean isHeavyWeightPopup)
                throws IllegalArgumentException {
            //  Auto-generated method stub
            return super.getPopup(owner, contents, x, y, isHeavyWeightPopup);
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            //  Auto-generated method stub
            return super.clone();
        }

        @Override
        public boolean equals(Object obj) {
            //  Auto-generated method stub
            return super.equals(obj);
        }

        @SuppressWarnings("removal")
        @Override
        protected void finalize() throws Throwable {
            //  Auto-generated method stub
            super.finalize();
        }

        @Override
        public int hashCode() {
            //  Auto-generated method stub
            return super.hashCode();
        }

 
}
