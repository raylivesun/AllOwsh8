/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package netbeans.allowsh8;

import net.kyori.adventure.key.Keyed;
import org.jetbrains.annotations.ApiStatus.ScheduledForRemoval;
import org.jetbrains.annotations.NotNull;

/**
 *
 * @author admin
 */
public interface KeyedValue<T extends Object> extends Keyed {

    @NotNull
    public static <T extends Object> KeyedValue<T> keyedValue(@NotNull final Key key, @NotNull final T value) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #1                  // class net/kyori/adventure/key/KeyedValueImpl
         * 3: dup
         * 4: aload_0
         * 5: aload_1
         * 6: ldc           #2                  // String value
         * 8: invokestatic  #3                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
         * 11: invokespecial #4                  // Method net/kyori/adventure/key/KeyedValueImpl."<init>":(Lnet/kyori/adventure/key/Key;Ljava/lang/Object;)V
         * 14: areturn
         *  */
        /* 0: new           #1                  // class net/kyori/adventure/key/KeyedValueImpl
         * 3: dup
         * 4: aload_0
         * 5: aload_1
         * 6: ldc           #2                  // String value
         * 8: invokestatic  #3                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
         * 11: invokespecial #4                  // Method net/kyori/adventure/key/KeyedValueImpl."<init>":(Lnet/kyori/adventure/key/Key;Ljava/lang/Object;)V
         * 14: areturn
         *  */
        // </editor-fold>
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #1                  // class net/kyori/adventure/key/KeyedValueImpl
         * 3: dup
         * 4: aload_0
         * 5: aload_1
         * 6: ldc           #2                  // String value
         * 8: invokestatic  #3                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
         * 11: invokespecial #4                  // Method net/kyori/adventure/key/KeyedValueImpl."<init>":(Lnet/kyori/adventure/key/Key;Ljava/lang/Object;)V
         * 14: areturn
         *  */
        /* 0: new           #1                  // class net/kyori/adventure/key/KeyedValueImpl
         * 3: dup
         * 4: aload_0
         * 5: aload_1
         * 6: ldc           #2                  // String value
         * 8: invokestatic  #3                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
         * 11: invokespecial #4                  // Method net/kyori/adventure/key/KeyedValueImpl."<init>":(Lnet/kyori/adventure/key/Key;Ljava/lang/Object;)V
         * 14: areturn
         *  */
        // </editor-fold>
        // </editor-fold>
    }

    @Deprecated
    @ScheduledForRemoval(inVersion = "5.0.0")
    @NotNull
    public static <T extends Object> KeyedValue<T> of(@NotNull final Key key, @NotNull final T value) {
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #1                  // class net/kyori/adventure/key/KeyedValueImpl
         * 3: dup
         * 4: aload_0
         * 5: aload_1
         * 6: ldc           #2                  // String value
         * 8: invokestatic  #3                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
         * 11: invokespecial #4                  // Method net/kyori/adventure/key/KeyedValueImpl."<init>":(Lnet/kyori/adventure/key/Key;Ljava/lang/Object;)V
         * 14: areturn
         *  */
        /* 0: new           #1                  // class net/kyori/adventure/key/KeyedValueImpl
         * 3: dup
         * 4: aload_0
         * 5: aload_1
         * 6: ldc           #2                  // String value
         * 8: invokestatic  #3                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
         * 11: invokespecial #4                  // Method net/kyori/adventure/key/KeyedValueImpl."<init>":(Lnet/kyori/adventure/key/Key;Ljava/lang/Object;)V
         * 14: areturn
         *  */
        // </editor-fold>
        // </editor-fold>
        return null;
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        // <editor-fold defaultstate="collapsed" desc="Compiled Code">
        /* 0: new           #1                  // class net/kyori/adventure/key/KeyedValueImpl
         * 3: dup
         * 4: aload_0
         * 5: aload_1
         * 6: ldc           #2                  // String value
         * 8: invokestatic  #3                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
         * 11: invokespecial #4                  // Method net/kyori/adventure/key/KeyedValueImpl."<init>":(Lnet/kyori/adventure/key/Key;Ljava/lang/Object;)V
         * 14: areturn
         *  */
        /* 0: new           #1                  // class net/kyori/adventure/key/KeyedValueImpl
         * 3: dup
         * 4: aload_0
         * 5: aload_1
         * 6: ldc           #2                  // String value
         * 8: invokestatic  #3                  // Method java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
         * 11: invokespecial #4                  // Method net/kyori/adventure/key/KeyedValueImpl."<init>":(Lnet/kyori/adventure/key/Key;Ljava/lang/Object;)V
         * 14: areturn
         *  */
        // </editor-fold>
        // </editor-fold>
    }

    @NotNull
    public T value();
    
}
Key