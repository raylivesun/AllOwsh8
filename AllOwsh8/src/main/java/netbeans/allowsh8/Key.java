/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package netbeans.allowsh8;

import java.util.Comparator;
import java.util.stream.Stream;
import net.kyori.adventure.key.Keyed;
import net.kyori.adventure.key.Namespaced;
import net.kyori.examination.Examinable;
import net.kyori.examination.ExaminableProperty;
import org.intellij.lang.annotations.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 *
 * @author admin
 */
interface Key extends Comparable<Key>, Examinable, Namespaced, Keyed {

    public static final String MINECRAFT_NAMESPACE = "minecraft";
    public static final char DEFAULT_SEPARATOR = ':';

    @NotNull
    public static Key key(@NotNull
            @Pattern(value = "([a-z0-9_\\-.]+:)?[a-z0-9_\\-./]+") final String string) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: bipush        58
         * 3: invokestatic  #2                  // InterfaceMethod key:(Ljava/lang/String;C)Lnet/kyori/adventure/key/Key;
         * 6: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: bipush        58
         * 3: invokestatic  #2                  // InterfaceMethod key:(Ljava/lang/String;C)Lnet/kyori/adventure/key/Key;
         * 6: areturn
         *  */
        // </editor-fold>
    }

    @NotNull
    public static Key key(@NotNull final String string, final char character) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iload_1
         * 2: invokevirtual #3                  // Method java/lang/String.indexOf:(I)I
         * 5: istore_2
         * 6: iload_2
         * 7: iconst_1
         * 8: if_icmplt     20
         * 11: aload_0
         * 12: iconst_0
         * 13: iload_2
         * 14: invokevirtual #4                  // Method java/lang/String.substring:(II)Ljava/lang/String;
         * 17: goto          22
         * 20: ldc           #5                  // String minecraft
         * 22: astore_3
         * 23: iload_2
         * 24: iflt          37
         * 27: aload_0
         * 28: iload_2
         * 29: iconst_1
         * 30: iadd
         * 31: invokevirtual #6                  // Method java/lang/String.substring:(I)Ljava/lang/String;
         * 34: goto          38
         * 37: aload_0
         * 38: astore        4
         * 40: aload_3
         * 41: aload         4
         * 43: invokestatic  #7                  // InterfaceMethod key:(Ljava/lang/String;Ljava/lang/String;)Lnet/kyori/adventure/key/Key;
         * 46: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: iload_1
         * 2: invokevirtual #3                  // Method java/lang/String.indexOf:(I)I
         * 5: istore_2
         * 6: iload_2
         * 7: iconst_1
         * 8: if_icmplt     20
         * 11: aload_0
         * 12: iconst_0
         * 13: iload_2
         * 14: invokevirtual #4                  // Method java/lang/String.substring:(II)Ljava/lang/String;
         * 17: goto          22
         * 20: ldc           #5                  // String minecraft
         * 22: astore_3
         * 23: iload_2
         * 24: iflt          37
         * 27: aload_0
         * 28: iload_2
         * 29: iconst_1
         * 30: iadd
         * 31: invokevirtual #6                  // Method java/lang/String.substring:(I)Ljava/lang/String;
         * 34: goto          38
         * 37: aload_0
         * 38: astore        4
         * 40: aload_3
         * 41: aload         4
         * 43: invokestatic  #7                  // InterfaceMethod key:(Ljava/lang/String;Ljava/lang/String;)Lnet/kyori/adventure/key/Key;
         * 46: areturn
         *  */
        // </editor-fold>
    }

    @NotNull
    public static Key key(@NotNull final Namespaced namespaced, @NotNull
            @Pattern(value = "[a-z0-9_\\-./]+") final String value) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokeinterface #8,  1            // InterfaceMethod net/kyori/adventure/key/Namespaced.namespace:()Ljava/lang/String;
         * 6: aload_1
         * 7: invokestatic  #7                  // InterfaceMethod key:(Ljava/lang/String;Ljava/lang/String;)Lnet/kyori/adventure/key/Key;
         * 10: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: invokeinterface #8,  1            // InterfaceMethod net/kyori/adventure/key/Namespaced.namespace:()Ljava/lang/String;
         * 6: aload_1
         * 7: invokestatic  #7                  // InterfaceMethod key:(Ljava/lang/String;Ljava/lang/String;)Lnet/kyori/adventure/key/Key;
         * 10: areturn
         *  */
        // </editor-fold>
    }

    @NotNull
    public static Key key(@NotNull
            @Pattern(value = "[a-z0-9_\\-.]+") final String namespace, @NotNull
            @Pattern(value = "[a-z0-9_\\-./]+") final String value) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #9                  // class net/kyori/adventure/key/KeyImpl
         * 3: dup
         * 4: aload_0
         * 5: aload_1
         * 6: invokespecial #10                 // Method net/kyori/adventure/key/KeyImpl."<init>":(Ljava/lang/String;Ljava/lang/String;)V
         * 9: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #9                  // class net/kyori/adventure/key/KeyImpl
         * 3: dup
         * 4: aload_0
         * 5: aload_1
         * 6: invokespecial #10                 // Method net/kyori/adventure/key/KeyImpl."<init>":(Ljava/lang/String;Ljava/lang/String;)V
         * 9: areturn
         *  */
        // </editor-fold>
    }

    @NotNull
    public static Comparator<? super Key> comparator() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     #11                 // Field net/kyori/adventure/key/KeyImpl.COMPARATOR:Ljava/util/Comparator;
         * 3: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: getstatic     #11                 // Field net/kyori/adventure/key/KeyImpl.COMPARATOR:Ljava/util/Comparator;
         * 3: areturn
         *  */
        // </editor-fold>
    }

    public static boolean parseable(@Nullable final String string) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: ifnonnull     6
         * 4: iconst_0
         * 5: ireturn
         * 6: aload_0
         * 7: bipush        58
         * 9: invokevirtual #3                  // Method java/lang/String.indexOf:(I)I
         * 12: istore_1
         * 13: iload_1
         * 14: iconst_1
         * 15: if_icmplt     27
         * 18: aload_0
         * 19: iconst_0
         * 20: iload_1
         * 21: invokevirtual #4                  // Method java/lang/String.substring:(II)Ljava/lang/String;
         * 24: goto          29
         * 27: ldc           #5                  // String minecraft
         * 29: astore_2
         * 30: iload_1
         * 31: iflt          44
         * 34: aload_0
         * 35: iload_1
         * 36: iconst_1
         * 37: iadd
         * 38: invokevirtual #6                  // Method java/lang/String.substring:(I)Ljava/lang/String;
         * 41: goto          45
         * 44: aload_0
         * 45: astore_3
         * 46: aload_2
         * 47: invokestatic  #12                 // InterfaceMethod parseableNamespace:(Ljava/lang/String;)Z
         * 50: ifeq          64
         * 53: aload_3
         * 54: invokestatic  #13                 // InterfaceMethod parseableValue:(Ljava/lang/String;)Z
         * 57: ifeq          64
         * 60: iconst_1
         * 61: goto          65
         * 64: iconst_0
         * 65: ireturn
         *  */
        // </editor-fold>
        return false;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: aload_0
         * 1: ifnonnull     6
         * 4: iconst_0
         * 5: ireturn
         * 6: aload_0
         * 7: bipush        58
         * 9: invokevirtual #3                  // Method java/lang/String.indexOf:(I)I
         * 12: istore_1
         * 13: iload_1
         * 14: iconst_1
         * 15: if_icmplt     27
         * 18: aload_0
         * 19: iconst_0
         * 20: iload_1
         * 21: invokevirtual #4                  // Method java/lang/String.substring:(II)Ljava/lang/String;
         * 24: goto          29
         * 27: ldc           #5                  // String minecraft
         * 29: astore_2
         * 30: iload_1
         * 31: iflt          44
         * 34: aload_0
         * 35: iload_1
         * 36: iconst_1
         * 37: iadd
         * 38: invokevirtual #6                  // Method java/lang/String.substring:(I)Ljava/lang/String;
         * 41: goto          45
         * 44: aload_0
         * 45: astore_3
         * 46: aload_2
         * 47: invokestatic  #12                 // InterfaceMethod parseableNamespace:(Ljava/lang/String;)Z
         * 50: ifeq          64
         * 53: aload_3
         * 54: invokestatic  #13                 // InterfaceMethod parseableValue:(Ljava/lang/String;)Z
         * 57: ifeq          64
         * 60: iconst_1
         * 61: goto          65
         * 64: iconst_0
         * 65: ireturn
         *  */
        // </editor-fold>
    }

    public static boolean parseableNamespace(@NotNull final String namespace) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: istore_1
         * 2: aload_0
         * 3: invokevirtual #14                 // Method java/lang/String.length:()I
         * 6: istore_2
         * 7: iload_1
         * 8: iload_2
         * 9: if_icmpge     31
         * 12: aload_0
         * 13: iload_1
         * 14: invokevirtual #15                 // Method java/lang/String.charAt:(I)C
         * 17: invokestatic  #16                 // InterfaceMethod allowedInNamespace:(C)Z
         * 20: ifne          25
         * 23: iconst_0
         * 24: ireturn
         * 25: iinc          1, 1
         * 28: goto          7
         * 31: iconst_1
         * 32: ireturn
         *  */
        // </editor-fold>
        return false;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: istore_1
         * 2: aload_0
         * 3: invokevirtual #14                 // Method java/lang/String.length:()I
         * 6: istore_2
         * 7: iload_1
         * 8: iload_2
         * 9: if_icmpge     31
         * 12: aload_0
         * 13: iload_1
         * 14: invokevirtual #15                 // Method java/lang/String.charAt:(I)C
         * 17: invokestatic  #16                 // InterfaceMethod allowedInNamespace:(C)Z
         * 20: ifne          25
         * 23: iconst_0
         * 24: ireturn
         * 25: iinc          1, 1
         * 28: goto          7
         * 31: iconst_1
         * 32: ireturn
         *  */
        // </editor-fold>
    }

    public static boolean parseableValue(@NotNull final String value) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: istore_1
         * 2: aload_0
         * 3: invokevirtual #14                 // Method java/lang/String.length:()I
         * 6: istore_2
         * 7: iload_1
         * 8: iload_2
         * 9: if_icmpge     31
         * 12: aload_0
         * 13: iload_1
         * 14: invokevirtual #15                 // Method java/lang/String.charAt:(I)C
         * 17: invokestatic  #17                 // InterfaceMethod allowedInValue:(C)Z
         * 20: ifne          25
         * 23: iconst_0
         * 24: ireturn
         * 25: iinc          1, 1
         * 28: goto          7
         * 31: iconst_1
         * 32: ireturn
         *  */
        // </editor-fold>
        return false;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_0
         * 1: istore_1
         * 2: aload_0
         * 3: invokevirtual #14                 // Method java/lang/String.length:()I
         * 6: istore_2
         * 7: iload_1
         * 8: iload_2
         * 9: if_icmpge     31
         * 12: aload_0
         * 13: iload_1
         * 14: invokevirtual #15                 // Method java/lang/String.charAt:(I)C
         * 17: invokestatic  #17                 // InterfaceMethod allowedInValue:(C)Z
         * 20: ifne          25
         * 23: iconst_0
         * 24: ireturn
         * 25: iinc          1, 1
         * 28: goto          7
         * 31: iconst_1
         * 32: ireturn
         *  */
        // </editor-fold>
    }

    public static boolean allowedInNamespace(final char character) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: invokestatic  #18                 // Method net/kyori/adventure/key/KeyImpl.allowedInNamespace:(C)Z
         * 4: ireturn
         *  */
        // </editor-fold>
        return false;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: invokestatic  #18                 // Method net/kyori/adventure/key/KeyImpl.allowedInNamespace:(C)Z
         * 4: ireturn
         *  */
        // </editor-fold>
    }

    public static boolean allowedInValue(final char character) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: invokestatic  #19                 // Method net/kyori/adventure/key/KeyImpl.allowedInValue:(C)Z
         * 4: ireturn
         *  */
        // </editor-fold>
        return false;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iload_0
         * 1: invokestatic  #19                 // Method net/kyori/adventure/key/KeyImpl.allowedInValue:(C)Z
         * 4: ireturn
         *  */
        // </editor-fold>
    }

    @NotNull
    @Override
    public String namespace();

    @NotNull
    public String value();

    @NotNull
    public String asString();

    @NotNull
    @Override
    public default Stream<? extends ExaminableProperty> examinableProperties() {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_2
         * 1: anewarray     #20                 // class net/kyori/examination/ExaminableProperty
         * 4: dup
         * 5: iconst_0
         * 6: ldc           #21                 // String namespace
         * 8: aload_0
         * 9: invokeinterface #22,  1           // InterfaceMethod namespace:()Ljava/lang/String;
         * 14: invokestatic  #23                 // Method net/kyori/examination/ExaminableProperty.of:(Ljava/lang/String;Ljava/lang/String;)Lnet/kyori/examination/ExaminableProperty;
         * 17: aastore
         * 18: dup
         * 19: iconst_1
         * 20: ldc           #24                 // String value
         * 22: aload_0
         * 23: invokeinterface #25,  1           // InterfaceMethod value:()Ljava/lang/String;
         * 28: invokestatic  #23                 // Method net/kyori/examination/ExaminableProperty.of:(Ljava/lang/String;Ljava/lang/String;)Lnet/kyori/examination/ExaminableProperty;
         * 31: aastore
         * 32: invokestatic  #26                 // InterfaceMethod java/util/stream/Stream.of:([Ljava/lang/Object;)Ljava/util/stream/Stream;
         * 35: areturn
         *  */
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: iconst_2
         * 1: anewarray     #20                 // class net/kyori/examination/ExaminableProperty
         * 4: dup
         * 5: iconst_0
         * 6: ldc           #21                 // String namespace
         * 8: aload_0
         * 9: invokeinterface #22,  1           // InterfaceMethod namespace:()Ljava/lang/String;
         * 14: invokestatic  #23                 // Method net/kyori/examination/ExaminableProperty.of:(Ljava/lang/String;Ljava/lang/String;)Lnet/kyori/examination/ExaminableProperty;
         * 17: aastore
         * 18: dup
         * 19: iconst_1
         * 20: ldc           #24                 // String value
         * 22: aload_0
         * 23: invokeinterface #25,  1           // InterfaceMethod value:()Ljava/lang/String;
         * 28: invokestatic  #23                 // Method net/kyori/examination/ExaminableProperty.of:(Ljava/lang/String;Ljava/lang/String;)Lnet/kyori/examination/ExaminableProperty;
         * 31: aastore
         * 32: invokestatic  #26                 // InterfaceMethod java/util/stream/Stream.of:([Ljava/lang/Object;)Ljava/util/stream/Stream;
         * 35: areturn
         *  */
        // </editor-fold>
    }

    @Override
    public default int compareTo(@NotNull final Key that) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  #27                 // InterfaceMethod comparator:()Ljava/util/Comparator;
         * 3: aload_0
         * 4: aload_1
         * 5: invokeinterface #28,  3           // InterfaceMethod java/util/Comparator.compare:(Ljava/lang/Object;Ljava/lang/Object;)I
         * 10: ireturn
         *  */
        // </editor-fold>
        return 0;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: invokestatic  #27                 // InterfaceMethod comparator:()Ljava/util/Comparator;
         * 3: aload_0
         * 4: aload_1
         * 5: invokeinterface #28,  3           // InterfaceMethod java/util/Comparator.compare:(Ljava/lang/Object;Ljava/lang/Object;)I
         * 10: ireturn
         *  */
        // </editor-fold>
    }

    
}
