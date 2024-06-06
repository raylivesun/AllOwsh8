/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package netbeans.allowsh8;

import org.intellij.lang.annotations.Pattern;
import org.jetbrains.annotations.NotNull;

/**
 *
 * @author admin
 */
public interface namespaced {
    @NotNull
    @Pattern(value = "[a-z0-9_\\-.]+")
    public String namespace();

    Object clone() throws CloneNotSupportedException;

    @Override
    boolean equals(Object obj);

    void finalize() throws Throwable;

    @Override
    int hashCode();

    @Override
    String toString();
    
}
