/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package netbeans.allowsh8;

import java.util.Comparator;
import java.util.stream.Stream;
import net.kyori.examination.ExaminableProperty;
import net.kyori.examination.Examiner;
import org.jetbrains.annotations.NotNull;

/**
 *
 * @author admin
 */
final class KeyImplEvent implements Key {
    
    static final Comparator<? super Key> COMPARATOR = null;
    static final String NAMESPACE_PATTERN = "[a-z0-9_\\-.]+";
    static final String VALUE_PATTERN = "[a-z0-9_\\-./]+";
    static boolean allowedInNamespace(final char character) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: bipush        95
         * 3: if_icmpeq     42
         * 6: iload_0
         * 7: bipush        45
         * 9: if_icmpeq     42
         * 12: iload_0
         * 13: bipush        97
         * 15: if_icmplt     24
         * 18: iload_0
         * 19: bipush        122
         * 21: if_icmple     42
         * 24: iload_0
         * 25: bipush        48
         * 27: if_icmplt     36
         * 30: iload_0
         * 31: bipush        57
         * 33: if_icmple     42
         * 36: iload_0
         * 37: bipush        46
         * 39: if_icmpne     46
         * 42: iconst_1
         * 43: goto          47
         * 46: iconst_0
         * 47: ireturn
         *  */
        // </editor-fold>
        return false;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: bipush        95
         * 3: if_icmpeq     42
         * 6: iload_0
         * 7: bipush        45
         * 9: if_icmpeq     42
         * 12: iload_0
         * 13: bipush        97
         * 15: if_icmplt     24
         * 18: iload_0
         * 19: bipush        122
         * 21: if_icmple     42
         * 24: iload_0
         * 25: bipush        48
         * 27: if_icmplt     36
         * 30: iload_0
         * 31: bipush        57
         * 33: if_icmple     42
         * 36: iload_0
         * 37: bipush        46
         * 39: if_icmpne     46
         * 42: iconst_1
         * 43: goto          47
         * 46: iconst_0
         * 47: ireturn
         *  */
        // </editor-fold>
    }

    static boolean allowedInValue(final char character) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: bipush        95
         * 3: if_icmpeq     48
         * 6: iload_0
         * 7: bipush        45
         * 9: if_icmpeq     48
         * 12: iload_0
         * 13: bipush        97
         * 15: if_icmplt     24
         * 18: iload_0
         * 19: bipush        122
         * 21: if_icmple     48
         * 24: iload_0
         * 25: bipush        48
         * 27: if_icmplt     36
         * 30: iload_0
         * 31: bipush        57
         * 33: if_icmple     48
         * 36: iload_0
         * 37: bipush        46
         * 39: if_icmpeq     48
         * 42: iload_0
         * 43: bipush        47
         * 45: if_icmpne     52
         * 48: iconst_1
         * 49: goto          53
         * 52: iconst_0
         * 53: ireturn
         *  */
        // </editor-fold>
        return false;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: bipush        95
         * 3: if_icmpeq     48
         * 6: iload_0
         * 7: bipush        45
         * 9: if_icmpeq     48
         * 12: iload_0
         * 13: bipush        97
         * 15: if_icmplt     24
         * 18: iload_0
         * 19: bipush        122
         * 21: if_icmple     48
         * 24: iload_0
         * 25: bipush        48
         * 27: if_icmplt     36
         * 30: iload_0
         * 31: bipush        57
         * 33: if_icmple     48
         * 36: iload_0
         * 37: bipush        46
         * 39: if_icmpeq     48
         * 42: iload_0
         * 43: bipush        47
         * 45: if_icmpne     52
         * 48: iconst_1
         * 49: goto          53
         * 52: iconst_0
         * 53: ireturn
         *  */
        // </editor-fold>
    }

    KeyImplEvent(@NotNull final String namespace, @NotNull final String value, final KeyImpl outer) {
    }

    @NotNull
    @Override
    public String namespace() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #14                 // Field namespace:Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #14                 // Field namespace:Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
    }

    @NotNull
    @Override
    public String value() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #16                 // Field value:Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #16                 // Field value:Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
    }

    @NotNull
    @Override
    public String asString() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #14                 // Field namespace:Ljava/lang/String;
         * 4: aload_0
         * 5: getfield      #16                 // Field value:Ljava/lang/String;
         * 8: invokestatic  #6                  // Method asString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         * 11: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #14                 // Field namespace:Ljava/lang/String;
         * 4: aload_0
         * 5: getfield      #16                 // Field value:Ljava/lang/String;
         * 8: invokestatic  #6                  // Method asString:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
         * 11: areturn
         *  */
        // </editor-fold>
    }

    @NotNull
    private static String asString(@NotNull final String namespace, @NotNull final String value) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #17                 // class java/lang/StringBuilder
         * 3: dup
         * 4: invokespecial #18                 // Method java/lang/StringBuilder."<init>":()V
         * 7: aload_0
         * 8: invokevirtual #19                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 11: bipush        58
         * 13: invokevirtual #20                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
         * 16: aload_1
         * 17: invokevirtual #19                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 20: invokevirtual #21                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 23: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #17                 // class java/lang/StringBuilder
         * 3: dup
         * 4: invokespecial #18                 // Method java/lang/StringBuilder."<init>":()V
         * 7: aload_0
         * 8: invokevirtual #19                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 11: bipush        58
         * 13: invokevirtual #20                 // Method java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
         * 16: aload_1
         * 17: invokevirtual #19                 // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
         * 20: invokevirtual #21                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
         * 23: areturn
         *  */
        // </editor-fold>
    }

    @NotNull
    @Override
    public String toString() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual #22                 // Method asString:()Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokevirtual #22                 // Method asString:()Ljava/lang/String;
         * 4: areturn
         *  */
        // </editor-fold>
    }

    @NotNull
    @Override
    public Stream<? extends ExaminableProperty> examinableProperties() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_2
         * 1: anewarray     #23                 // class net/kyori/examination/ExaminableProperty
         * 4: dup
         * 5: iconst_0
         * 6: ldc           #11                 // String namespace
         * 8: aload_0
         * 9: getfield      #14                 // Field namespace:Ljava/lang/String;
         * 12: invokestatic  #24                 // Method net/kyori/examination/ExaminableProperty.of:(Ljava/lang/String;Ljava/lang/String;)Lnet/kyori/examination/ExaminableProperty;
         * 15: aastore
         * 16: dup
         * 17: iconst_1
         * 18: ldc           #15                 // String value
         * 20: aload_0
         * 21: getfield      #16                 // Field value:Ljava/lang/String;
         * 24: invokestatic  #24                 // Method net/kyori/examination/ExaminableProperty.of:(Ljava/lang/String;Ljava/lang/String;)Lnet/kyori/examination/ExaminableProperty;
         * 27: aastore
         * 28: invokestatic  #25                 // InterfaceMethod java/util/stream/Stream.of:([Ljava/lang/Object;)Ljava/util/stream/Stream;
         * 31: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_2
         * 1: anewarray     #23                 // class net/kyori/examination/ExaminableProperty
         * 4: dup
         * 5: iconst_0
         * 6: ldc           #11                 // String namespace
         * 8: aload_0
         * 9: getfield      #14                 // Field namespace:Ljava/lang/String;
         * 12: invokestatic  #24                 // Method net/kyori/examination/ExaminableProperty.of:(Ljava/lang/String;Ljava/lang/String;)Lnet/kyori/examination/ExaminableProperty;
         * 15: aastore
         * 16: dup
         * 17: iconst_1
         * 18: ldc           #15                 // String value
         * 20: aload_0
         * 21: getfield      #16                 // Field value:Ljava/lang/String;
         * 24: invokestatic  #24                 // Method net/kyori/examination/ExaminableProperty.of:(Ljava/lang/String;Ljava/lang/String;)Lnet/kyori/examination/ExaminableProperty;
         * 27: aastore
         * 28: invokestatic  #25                 // InterfaceMethod java/util/stream/Stream.of:([Ljava/lang/Object;)Ljava/util/stream/Stream;
         * 31: areturn
         *  */
        // </editor-fold>
    }

    @Override
    public boolean equals(final Object other) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: if_acmpne     7
         * 5: iconst_1
         * 6: ireturn
         * 7: aload_1
         * 8: instanceof    #26                 // class net/kyori/adventure/key/Key
         * 11: ifne          16
         * 14: iconst_0
         * 15: ireturn
         * 16: aload_1
         * 17: checkcast     #26                 // class net/kyori/adventure/key/Key
         * 20: astore_2
         * 21: aload_0
         * 22: getfield      #14                 // Field namespace:Ljava/lang/String;
         * 25: aload_2
         * 26: invokeinterface #27,  1           // InterfaceMethod net/kyori/adventure/key/Key.namespace:()Ljava/lang/String;
         * 31: invokestatic  #28                 // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
         * 34: ifeq          57
         * 37: aload_0
         * 38: getfield      #16                 // Field value:Ljava/lang/String;
         * 41: aload_2
         * 42: invokeinterface #29,  1           // InterfaceMethod net/kyori/adventure/key/Key.value:()Ljava/lang/String;
         * 47: invokestatic  #28                 // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
         * 50: ifeq          57
         * 53: iconst_1
         * 54: goto          58
         * 57: iconst_0
         * 58: ireturn
         *  */
        // </editor-fold>
        return false;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: if_acmpne     7
         * 5: iconst_1
         * 6: ireturn
         * 7: aload_1
         * 8: instanceof    #26                 // class net/kyori/adventure/key/Key
         * 11: ifne          16
         * 14: iconst_0
         * 15: ireturn
         * 16: aload_1
         * 17: checkcast     #26                 // class net/kyori/adventure/key/Key
         * 20: astore_2
         * 21: aload_0
         * 22: getfield      #14                 // Field namespace:Ljava/lang/String;
         * 25: aload_2
         * 26: invokeinterface #27,  1           // InterfaceMethod net/kyori/adventure/key/Key.namespace:()Ljava/lang/String;
         * 31: invokestatic  #28                 // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
         * 34: ifeq          57
         * 37: aload_0
         * 38: getfield      #16                 // Field value:Ljava/lang/String;
         * 41: aload_2
         * 42: invokeinterface #29,  1           // InterfaceMethod net/kyori/adventure/key/Key.value:()Ljava/lang/String;
         * 47: invokestatic  #28                 // Method java/util/Objects.equals:(Ljava/lang/Object;Ljava/lang/Object;)Z
         * 50: ifeq          57
         * 53: iconst_1
         * 54: goto          58
         * 57: iconst_0
         * 58: ireturn
         *  */
        // </editor-fold>
    }

    @Override
    public int hashCode() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #14                 // Field namespace:Ljava/lang/String;
         * 4: invokevirtual #30                 // Method java/lang/String.hashCode:()I
         * 7: istore_1
         * 8: bipush        31
         * 10: iload_1
         * 11: imul
         * 12: aload_0
         * 13: getfield      #16                 // Field value:Ljava/lang/String;
         * 16: invokevirtual #30                 // Method java/lang/String.hashCode:()I
         * 19: iadd
         * 20: istore_1
         * 21: iload_1
         * 22: ireturn
         *  */
        // </editor-fold>
        return 0;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: getfield      #14                 // Field namespace:Ljava/lang/String;
         * 4: invokevirtual #30                 // Method java/lang/String.hashCode:()I
         * 7: istore_1
         * 8: bipush        31
         * 10: iload_1
         * 11: imul
         * 12: aload_0
         * 13: getfield      #16                 // Field value:Ljava/lang/String;
         * 16: invokevirtual #30                 // Method java/lang/String.hashCode:()I
         * 19: iadd
         * 20: istore_1
         * 21: iload_1
         * 22: ireturn
         *  */
        // </editor-fold>
    }

    @Override
    public int compareTo(@NotNull final Key that) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokespecial #31                 // InterfaceMethod net/kyori/adventure/key/Key.compareTo:(Lnet/kyori/adventure/key/Key;)I
         * 5: ireturn
         *  */
        // </editor-fold>
        return 0;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: aload_1
         * 2: invokespecial #31                 // InterfaceMethod net/kyori/adventure/key/Key.compareTo:(Lnet/kyori/adventure/key/Key;)I
         * 5: ireturn
         *  */
        // </editor-fold>
    }

    @Override
    public String examinableName() {
        return Key.super.examinableName(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public <R> R examine(Examiner<R> examiner) {
        return Key.super.examine(examiner); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public net.kyori.adventure.key.Key key() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
