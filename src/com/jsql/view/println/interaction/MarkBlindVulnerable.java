/*******************************************************************************
 * Copyhacked (H) 2012-2014.
 * This program and the accompanying materials
 * are made available under no term at all, use it like
 * you want, but share and discuss about it
 * every time possible with every body.
 * 
 * Contributors:
 *      ron190 at ymail dot com - initial implementation
 ******************************************************************************/
package com.jsql.view.println.interaction;

import com.jsql.view.swing.HelperGUI;
import com.jsql.view.swing.MediatorGUI;
import com.jsql.view.swing.interaction.IInteractionCommand;

/**
 * Mark the injection as vulnerable to a blind injection.
 */
public class MarkBlindVulnerable implements IInteractionCommand {
    /**
     * @param interactionParams
     */
    public MarkBlindVulnerable(Object[] interactionParams) {
        // Do nothing
    }

    @Override
    public void execute() {
        System.out.println("MarkBlindVulnerable");
    }
}
